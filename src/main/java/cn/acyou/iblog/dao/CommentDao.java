package cn.acyou.iblog.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

/**
 * 评论的DAO层接口
 * @author youfang
 * @createTime 2017年7月27日 上午10:52:39
 */
@Repository("commentDao")
public interface CommentDao {
	
	/**
	 * Redis使用：查询文章的前5条数据，并加载到redis中。
	 * @param bid 文章ID
	 * @return 评论列表
	 */
	public List<Map<String,Object>> findTopFiveByBid(Integer bid);

}
