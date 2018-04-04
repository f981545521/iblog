package cn.acyou.iblog.test;

import cn.acyou.iblog.model.LifeBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.acyou.iblog.service.ActiveCodeService;

public class TestMain {
	
	@Test
	public void test1(){
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("conf/spring-mvc.xml","conf/spring-mybatis.xml","conf/spring-service.xml");
		ActiveCodeService service=ctx.getBean("activeCodeService",ActiveCodeService.class);
		String mess=service.saveActiveCode("981545521@qq.com");
		System.out.println(mess);
	}

	@Test
	public void test2(){
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("conf/spring-mvc.xml","conf/spring-mybatis.xml","conf/spring-service.xml");
        LifeBean service=ctx.getBean("lifeBean",LifeBean.class);
        System.out.println(service.sayHello());
        service.destory();
	}

}
