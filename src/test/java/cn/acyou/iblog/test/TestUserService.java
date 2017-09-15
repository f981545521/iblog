package cn.acyou.iblog.test;

import org.junit.Before;
import org.junit.Test;

import cn.acyou.iblog.entity.User;
import cn.acyou.iblog.service.UserService;

public class TestUserService extends BaseTest{
	
	private UserService service;
	
	@Before
	public void inituserservice(){
		service=ctx.getBean("userService",UserService.class);
	}
	
	@Test
	public void test1(){
		String mess=service.checkEmail("yo1ufang@acyou.cn");
		System.out.println(mess);
	}
	
	@Test
	public void test2(){
		User u=service.registUser("demo@acyou.cn", "demo", "123456", "123456", "aaa");
		System.out.println(u);
	}
}
