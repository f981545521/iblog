package cn.acyou.iblog.test;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest {

	protected ClassPathXmlApplicationContext ctx;

	public BaseTest() {
		super();
	}

	@Before
	public void init() {
		ctx=new ClassPathXmlApplicationContext
				("conf/spring-mvc.xml","conf/spring-mybatis.xml","conf/spring-service.xml");
		
	}

	@After
	public void destroy() {
		ctx.close();
	}

}