package cn.acyou.interview.javase;

import java.util.Date;

import org.junit.Test;

/**
 * java.util.Date 是 java.sql.Date 的父类（注意拼写） 前者是常用的表示时间的类，我们通常格式化或者得到当前时间都是用他
 * 后者之后在读写数据库的时候用他，因为PreparedStament的setDate()的第2参数和ResultSet的 getDate()方法的第2个参数都是java.sql.Date 
 * 转换是 java.sql.Date date=new Java.sql.Date(); java.util.Date d=new java.util.Date (date.getTime()); 反过来是一样的。
 * <p>title：DateClass</p>
 * @author youfang
 * @date 2017年11月21日 下午9:58:28
 */
public class DateClass {

	@Test
	public void test1(){
		Date date = new Date();
		System.out.println(date);
	}
	
	
	@Test
	public void test2(){
		java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
		
		System.out.println(date.getTime());
	}

}
