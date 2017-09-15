package cn.acyou.iblog.dao;

import java.util.List;
import java.util.Map;

import cn.acyou.iblog.entity.Sort;
/**
 * 文章分类的数据库访问层
 * @author youfang
 * @createTime 2017年8月7日 下午5:25:47
 */
public interface SortDao {
	
	/**文章分类：按照UID查找所属分类*/
	public List<Map<String,Object>> findsSortsByUid(String uid);
	
	/**添加分类*/
	public int addSort(Sort sort);
	
	/**
	 * 删除分类
	 * @param sid 要删除的分类的sid
	 * @return 返回影响的行数
	 */
	public int delSortBySid(String sid);
	
	/**
	 * 修改分类
	 * @param sort 分类
	 * @return
	 */
	public int updateSort(Sort sort);
	
	/**
	 * 按照SID查找这个Sort
	 * @param sid
	 * @return
	 */
	public Sort findSortBySid(String sid);
	
	/**
	 * 根据UID查找分类名和表述；添加的文章的时候需要用到
	 * @param uid
	 * @return
	 */
	public List<Map<String,Object>> findSortNamesByUid(String uid);
}
