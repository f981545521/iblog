package cn.acyou.iblog.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cn.acyou.iblog.dao.ActiveCodeDao;

public class TestActiveCodeDao extends BaseTest {
	ActiveCodeDao dao;
	@Before
	public void initTestActiveDao(){
		dao=ctx.getBean("activeCodeDao",ActiveCodeDao.class);
	}
	@Test
	public void test1(){
		int a=dao.addActiveCode("asd@qwe.cn", "HHJKL");
		System.out.println(a);
	}
	@Test
	public void test2(){
		List<String> ss=dao.findActiveCodeByEmail("981545521@qq.com");
		System.out.println(ss);
	}

}
