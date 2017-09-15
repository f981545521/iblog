package cn.acyou.iblog.service.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.acyou.iblog.dao.SortDao;
import cn.acyou.iblog.dao.UserDao;
import cn.acyou.iblog.entity.Sort;
import cn.acyou.iblog.entity.User;
import cn.acyou.iblog.service.SortService;
import cn.acyou.iblog.service.UserNotFoundException;

/**
 * 分类管理服务层
 * @author youfang
 * @createTime 2017年8月21日 下午3:11:29
 */
@Service("sortService")
public class SortServiceImpl implements SortService{
	@Resource
	private SortDao sortDao;
	@Resource
	private UserDao userDao;
	/**
	 * 按照uid列出：分类列表
	 * @param uid
	 * @return
	 * @throws UserNotFoundException
	 * @author youfang
	 * @date 2017年8月21日 下午3:34:45
	 */
	public List<Map<String, Object>> listSorts(String uid) throws UserNotFoundException {
		if(uid==null||uid.trim().isEmpty()){
			throw new UserNotFoundException("用户ID不能为空!");
		}
		User user=userDao.findUserBuUid(uid);
		if(user==null){
			throw new UserNotFoundException("用户不存在!");
		}
		List<Map<String, Object>> sorts=sortDao.findsSortsByUid(uid);
		return sorts;
	}
	/**
	 * 增加分类
	 * @param sortName
	 * @param uid
	 * @param description
	 * @return
	 * @author youfang
	 * @date 2017年8月21日 下午3:34:28
	 */
	public int addSort(String sortName, Integer uid, String description) {
		Sort sort = new Sort();
		sort.setSortName(sortName);
		sort.setUid(uid);
		sort.setDescription(description);
		int n = sortDao.addSort(sort);
		return n;
	}
	/**
	 * 删除分类
	 * @param sid
	 * @return
	 * @author youfang
	 * @date 2017年9月7日 上午10:15:12
	 */
	public int delSort(String sid) {
		int n = sortDao.delSortBySid(sid);
		return n;
	}
	/**
	 * 修改分类
	 * @param sid	要修改的分类ID
	 * @param sortName	分类名称
	 * @param description	描述
	 * @return	影响的行数
	 * @author youfang
	 * @date 2017年9月7日 下午7:11:55
	 */
	public Sort updateSort(String sid, String sortName, String description) {
		Sort sort = new Sort();
		sort.setSid(Integer.parseInt(sid));
		sort.setSortName(sortName);
		sort.setDescription(description);
		int n = sortDao.updateSort(sort);
		if(n == 1){
			return sortDao.findSortBySid(sid);
		}
		//这地方还要改善：修改不成功告诉Controller
		return null;
	}
	
	/**
	 * 添加文章的时候使用：获取用户所有分类名与描述
	 * @param uid
	 * @return
	 * @author youfang
	 * @date 2017年9月14日 下午4:40:10
	 */
	public List<Map<String, Object>> listSortNames(String uid) {
		return sortDao.findSortNamesByUid(uid);
	}

}
