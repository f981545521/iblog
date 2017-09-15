package cn.acyou.iblog.othertest;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class TestTimestamp {
	
	@Test
	public void test1(){
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Timestamp t=new Timestamp(System.currentTimeMillis());
		System.out.println(fmt.format(t));
	}

}
