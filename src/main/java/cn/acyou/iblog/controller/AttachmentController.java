package cn.acyou.iblog.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.acyou.iblog.service.AttachmentService;
import cn.acyou.iblog.util.JsonResult;

/**
 * 附件模块控制器
 * @author youfang
 * @createTime 2017年7月22日 下午5:21:56
 */
@Controller
@RequestMapping("attachment")
public class AttachmentController {
	/**service*/
	@Resource
	private AttachmentService attachmentService;
    /**上传文件*/
	@RequestMapping("upload.do")
	@ResponseBody
	public JsonResult upload(MultipartFile userfile, HttpServletRequest request,Integer uid,Integer bid, String description){
		try {
			attachmentService.saveAttahment(userfile, request, uid, bid, description);
		} catch (IllegalStateException e) {
			e.printStackTrace();
			return new JsonResult("false");
		} catch (IOException e) {
			e.printStackTrace();
			return new JsonResult("false");
		}
		return new JsonResult("true");
	}
	
	/**
	 * 列出附件
	 * @param uid	用户ID
	 * @param pageId	当前页
	 * @return
	 */
	@RequestMapping("/page.do")
	@ResponseBody
	public JsonResult page(String uid,Integer pageId){
		//由于分页是从0开始；而页数是从1开始，需要将传入的页数-1
		pageId = pageId - 1;
		List<Map<String,Object>>list = attachmentService.listAttachments(uid, pageId);
		return new JsonResult(list);
	}
	
	/**
	 * 列出一共有多少记录
	 * @param uid 用户ID
	 * @return 总记录数
	 */
	@RequestMapping("/pageTotal.do")
	@ResponseBody
	public int pageTotal(int uid){
		return attachmentService.countAttachmentByUid(uid);
	}

}
