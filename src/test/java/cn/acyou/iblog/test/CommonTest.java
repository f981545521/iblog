package cn.acyou.iblog.test;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.acyou.iblog.scheduled.IMyTestService;
import cn.acyou.iblog.scheduled.MyTask2;
import cn.acyou.iblog.service.CommonService;

public class CommonTest extends BaseTest{
	CommonService commonService;
	
	IMyTestService service;
	
	MyTask2 mytask;
	@Before
	public void initTestActiveDao(){
		commonService=ctx.getBean("commonService",CommonService.class);
	}
	@Test
	public void test1(){
		List<Map<String,Object>> list=commonService.getWeather("114.222.237.206");
		for(Map<String,Object>map:list){
			System.out.println(map);
		}
		
	}
	
	/**
	 * 测试TASK
	 * 
	 */
	@Test
	public void test2(){
		service =  ctx.getBean("myTestService",IMyTestService.class);
		service.myTest();
	}
	@Test
	public void test3(){
		mytask =  ctx.getBean("myTask2",MyTask2.class);
		
	}
	

}
