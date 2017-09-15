package cn.acyou.iblog.service;

import java.util.List;
import java.util.Map;

import cn.acyou.iblog.entity.Sort;

/**文章分类*/
public interface SortService {
	
	/**
	 * 按照uid查找属于自己分类
	 * @param uid
	 * @return
	 * @throws UserNotFoundException
	 */
	public List<Map<String,Object>> listSorts (String uid) throws UserNotFoundException;
	/** 
	 * 添加分类
	 * @param sortName
	 * @param uid
	 * @param description
	 * @return
	 */
	public int addSort(String sortName,Integer uid,String description);
	/**
	 * 删除分类
	 * @param sid 要删除的ID
	 * @return
	 */
	public int delSort(String sid);
	
	/**
	 * 修改分类
	 * @param sid	要修改的分类ID
	 * @param sortName	分类名称
	 * @param description	描述
	 * @return	影响的行数
	 */
	public Sort updateSort(String sid,String sortName,String description);
	/**
	 * 添加文章的时候使用：获取用户所有分类名与描述
	 * @param uid
	 * @return
	 */
	public List<Map<String,Object>> listSortNames(String uid);
	
}
