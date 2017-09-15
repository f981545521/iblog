package cn.acyou.iblog.test;


import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import cn.acyou.iblog.dao.UserDao;
import cn.acyou.iblog.entity.User;
import cn.acyou.iblog.service.UserService;



public class TestUserDao extends BaseTest {
	UserDao dao;
	private static Logger log=Logger.getLogger(TestUserDao.class);
	@Before
	public void initUserDao(){
		dao=ctx.getBean("userDao",UserDao.class);
	}
	
	//测试UserDao
	@Test
	public void testfindUserByName(){
		String name="admin";
		User u=dao.findUserByUserName(name);
		System.out.println(u);
	}
	//测试UserServiceImpl
	@Test
	public void test1(){
		String name="admin";
		String pwd="admin123";
		UserService service=ctx.getBean("userService",UserService.class);
		User u=service.login(name, pwd);
		System.out.println(u);
	}
	//测试保存用户
	@Test
	public void test2(){
		User u=new User();
		u.setUsername("demo111");
		u.setPassword("demo1123");
		u.setEmail("demo@acyou.cn");
		System.out.println(u);
		int n=dao.addUser(u);
		System.out.println(n);
	}
	//测试保存激活码
	
	/**测试按照邮箱查找用户*/
	@Test
	public void test3(){
		String a=dao.findUserByEmail("youfang@acyou.cn");
		System.out.println(a);
	}
	@Test
	public void test4(){
		User u=dao.findUserBuUid("1");
		log.info(u);
		System.out.println(u);
	}
	
}
