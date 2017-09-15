package cn.acyou.iblog.cache.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import cn.acyou.iblog.cache.CommentCache;
import cn.acyou.iblog.dao.CommentDao;

/**
 * 评论缓存实现类
 * @author youfang
 * @createTime 2017年7月31日 下午3:58:05
 */
@Repository("commentCache")
public class CommentCacheImpl implements CommentCache{
	@Resource
	private CommentDao commentDao;
	/**日志记录器*/
	private static final Logger log=Logger.getLogger(CommentCache.class);

	/**
	 * 调用DAO将查询结果存到redis中；
	 */
	public List<Map<String, Object>> findTopFiveByBid(Integer bid) {
		List<Map<String,Object>> list=commentDao.findTopFiveByBid(bid);
		log.warn("查询博客ID:"+bid+";message:"+list);
		return list;
	}
	
	
	
	
	
	

}
