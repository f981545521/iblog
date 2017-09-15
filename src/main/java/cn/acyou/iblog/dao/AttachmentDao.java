package cn.acyou.iblog.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.acyou.iblog.entity.Attachment;

/**
 * 附件：
 */
@Repository("attachmentDao")
public interface AttachmentDao {
	
	/**	附件列表：
	 * 分页：查看属于自己的所有附件；
	 * */
	public List<Map<String,Object>> findAttachementsByUid(
			@Param("uid")String uid,@Param("start")int start,@Param("pageSize")int pageSize);
	/**保存附件*/
	public int saveAttachment(Attachment attachment);
	/**一共有多少条记录*/
	public Integer countAttachmentByUid(int uid);
}
