package cn.acyou.iblog.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.acyou.iblog.entity.Sort;
import cn.acyou.iblog.service.SortService;
import cn.acyou.iblog.util.JsonResult;

@Controller
@RequestMapping("/sort")
public class SortController {
	
	private Logger log = Logger.getLogger(getClass());
	
	@Resource
	private SortService sortService;
	
	/**
	 * 查看所有分类
	 * @param uid
	 * @return
	 */
	@RequestMapping("list.do")
	@ResponseBody
	public JsonResult listSorts(String uid){
		List<Map<String,Object>>list=sortService.listSorts(uid);
		//System.out.println(list);
		return new JsonResult(list);
	}
	/**
	 * 添加分类
	 * @param sortName
	 * @param uid
	 * @param description
	 * @return
	 */
	@RequestMapping("addSort.do")
	@ResponseBody
	public JsonResult addSort(String sortName,Integer uid,String description){
		
		log.warn("添加分类信息：" + sortName + "" + uid + "" + description);
		int n = sortService.addSort(sortName, uid, description);
		if(n!=1){
			return new JsonResult("添加分类失败！");
		}
		return new JsonResult("添加成功");
	}
	/**
	 * 删除分类
	 * @param sid
	 * @return
	 */
	@RequestMapping("delSort.do")
	@ResponseBody
	public JsonResult delSort(String sid){
		int n = sortService.delSort(sid);
		if(n!=1){
			return new JsonResult(1,"删除分类失败！");
		}
		return new JsonResult(0,"删除成功！");
	}
	
	/**
	 * 修改分类
	 * @param sid
	 * @param sortName
	 * @param description
	 * @return
	 */
	@RequestMapping("updateSort.do")
	@ResponseBody
	public JsonResult updateSort(String sid,String sortName,String description){
		Sort sort = sortService.updateSort(sid, sortName, description);
		return new JsonResult(sort);

		
	}
	
	@RequestMapping("listSortNames.do")
	@ResponseBody
	public JsonResult listSortNames(String uid){
		List<Map<String,Object>> list = sortService.listSortNames(uid);
		return new JsonResult(list);
	}
	
	
	
	
	
	

}
