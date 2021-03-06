package cn.acyou.iblog.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.acyou.iblog.vo.SortVo;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import cn.acyou.iblog.dao.SortDao;
import cn.acyou.iblog.entity.Sort;

public class TestSortDao extends BaseTest{
	private SortDao sortDao;
	private static Logger log=Logger.getLogger(TestSortDao.class);

	@Before
	public void initsort(){
		sortDao=ctx.getBean("sortDao",SortDao.class);
	}
	@Test
	public void test1(){
		List<Sort> list=sortDao.findAll();
		for(Sort sortVo:list){
//			System.out.println(map);
			log.warn(sortVo);
		}
	}
	
	
	@Test
	public void test2(){
		Sort sort=new Sort();
		sort.setSortName("天气越来越冷啦");
		sort.setUid(1);
		sort.setDescription("不开空调不行啦");
		sort.setCreateTime(new Timestamp(System.currentTimeMillis()));
		sort.setModifiedtime(new Date());
		int n = sortDao.addSort(sort);
		System.out.println(n);
	}
	
	
	@Test
	public void test3(){
		int n = sortDao.delSortBySid("37");
		System.out.println(n);
	}
	
	@Test
	public void test4(){
		Sort sort = new Sort();
		sort.setId(10);
		sort.setDescription("还用说吗？这还用说吗?");
		int n = sortDao.updateSort(sort);
		System.out.println(n);
		
	}
	
	@Test
	public void test5(){
		Sort sort = sortDao.findSortBySid("43");
		System.out.println(sort);
	}
	
	@Test
	public void test6(){
		List<Map<String,Object>> list = sortDao.findSortNamesByUid("1");
		System.out.println(list);
		for(Map<String,Object> map : list){
			System.out.println(map);
		}
	}
	
	
	
	@Test
	public void testTimeStamp(){
		Timestamp time = new Timestamp(System.currentTimeMillis());
		System.out.println(time);
	}
	
	
}
