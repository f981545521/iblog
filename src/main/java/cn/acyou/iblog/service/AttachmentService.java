package cn.acyou.iblog.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

/**
 * 附件：业务层接口
 *
 */
public interface AttachmentService {
	/**保存附件*/
	public int saveAttahment(MultipartFile userfile,HttpServletRequest request,Integer uid,Integer bid,String description) throws IllegalStateException, IOException;
    /**列出所有笔记本：分页模式*/
    public List<Map<String,Object>> listAttachments(String uid,Integer pageId)throws UserNotFoundException;
    /**查看自己一个有多少附件*/
    public int countAttachmentByUid(int uid);
}
