package cn.acyou.iblog.test;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.acyou.iblog.dao.CommentDao;


public class CommentDaoTest extends BaseTest{

	private CommentDao dao;
	@Before
	public void initthis(){
		dao=ctx.getBean("commentDao",CommentDao.class);
	}
	
	@Test
	public void test1(){
		List<Map<String,Object>> list=dao.findTopFiveByBid(1);
		System.out.println(list);
	}
}
