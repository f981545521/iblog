package cn.acyou.iblog.test;

import java.util.List;
import java.util.Map;

import cn.acyou.iblog.dao.SortDao;
import cn.acyou.iblog.entity.Sort;
import cn.acyou.iblog.vo.SortVo;
import org.junit.Before;
import org.junit.Test;

import cn.acyou.iblog.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class TestSortService extends BaseTest{

	private SortService sortService;

	private SortDao sortDao;
	
	@Before
	public void initsortsevice(){
		sortService=ctx.getBean("sortService",SortService.class);
		sortDao = ctx.getBean("sortDao",SortDao.class);
	}
	@Test
	public void test1(){
		List<Map<String,Object>> list=sortService.listSorts("1");
		for(Map<String,Object>map:list){
			System.out.println(map);
		}
	}

	@Test
	public void test2(){
		List<Sort> list = sortDao.findAll();
		for (Sort sort : list){
			System.out.println(sort);
		}
	}

}
