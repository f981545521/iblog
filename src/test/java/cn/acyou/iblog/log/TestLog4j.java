package cn.acyou.iblog.log;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

public class TestLog4j {
	private static Logger logger = Logger.getLogger(TestLog4j.class);
	@Test
	public void test(){
		BasicConfigurator.configure();
		PropertyConfigurator.configure(TestLog4j.class.getResource("conf/log4j.properties"));
        logger.info("info测试");
        logger.debug("debug测试 ");
        logger.error("error测试");
	}

}
