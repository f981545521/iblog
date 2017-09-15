package cn.acyou.iblog.test;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.acyou.iblog.service.SortService;

public class TestSortService extends BaseTest{

	private SortService sortService;
	
	@Before
	public void initsortsevice(){
		sortService=ctx.getBean("sortService",SortService.class);
	}
	@Test
	public void test1(){
		List<Map<String,Object>> list=sortService.listSorts("1");
		for(Map<String,Object>map:list){
			System.out.println(map);
		}
	}

}
