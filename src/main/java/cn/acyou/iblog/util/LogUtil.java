package cn.acyou.iblog.util;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.net.SyslogAppender;

/**
 * 封装Log4j为Log工具类
 * (暂不使用)
 * @author youfang
 *
 */
public class LogUtil {
	
	private static Logger logger = Logger.getLogger(LogUtil.class);  
	
	/**
	 * Log4j的原生Logger
	 * @param classname 类名.class
	 * @return Logger
	 */
	public static Logger getLogger(Class<?> classname){
		return Logger.getLogger(classname);
	}
	/**
	 * 自定义级别
	 */
    private static class CustomLevel extends Level {  
        private static final long serialVersionUID = 1076913470822079835L;  
        private CustomLevel(int level, String name, int sysLogLevel) {  
            super(level, name, sysLogLevel);  
        }  
    }  
  
    private static final Level BANIT_LOG_LEVEL = new CustomLevel(90050, "important",  
            SyslogAppender.LOG_LOCAL5);  
  
    public static void log(Object Message) {  
        logger.log(BANIT_LOG_LEVEL, Message);  
    }  

}
