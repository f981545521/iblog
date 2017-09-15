package cn.acyou.interview;

import java.util.Arrays;

public class TestNullPointException {
	public static void main(String[] args) {
		String[] s = {"123","2134"};
		System.out.println(Arrays.toString(s));
		s = null;
		System.out.println(s);
		
	}
	
}
