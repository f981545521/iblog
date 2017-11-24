package cn.acyou.interview.javase;

import java.util.UUID;

import org.junit.Test;

public class TestOne {

	public static void main(String[] args) {
		int c = TestOne.method();
		System.out.println(c);
	}
	
	public static int method(){
		int num = 10;
		if(num>20){
			return num;
		}
		return 30;
	}
	
	@Test
	public void test1(){
		System.out.println(UUID.randomUUID());
	}

}
