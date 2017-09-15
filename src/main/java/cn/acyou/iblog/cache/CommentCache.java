package cn.acyou.iblog.cache;

import java.util.List;
import java.util.Map;

/**
 * 数据库缓存层：评论
 * 作用：用redis做MySQL的缓存层；
 *    每次加载评论的前5条到redis数据库中；
 *    先读DB前，先读缓存，如果有直接返回，如果没有再读DB，然后写入缓存层并返回。
 * @author youfang
 * @createTime 2017年7月22日 下午4:07:16
 */
public interface CommentCache {
	/**查找前5条评论；*/
	public List<Map<String,Object>> findTopFiveByBid(Integer bid);
	
	
	
}
