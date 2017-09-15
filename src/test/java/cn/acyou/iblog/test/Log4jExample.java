package cn.acyou.iblog.test;

import java.io.*;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.junit.Test;


public class Log4jExample{
	//获取日志记录器
  private static Logger log = Logger.getLogger(Log4jExample.class);

  @Test
  public void test1(){
	  Logger logger=Logger.getRootLogger();
//	  log.setLevel(Level.WARN);
      log.trace("Trace Message!");
      log.debug("Debug Message!");
      log.info("Info Message!");
      log.warn("Warn Message!");
      log.error("Error Message!");
      log.fatal("Fatal Message!");
      logger.warn("Loger警告！");
      
  }
}