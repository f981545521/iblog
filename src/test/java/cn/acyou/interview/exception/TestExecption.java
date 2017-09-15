package cn.acyou.interview.exception;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestExecption {

	/**
	 * 数组下标越界
	 * java.lang.ArrayIndexOutOfBoundsException: 11
	 */
	@Test
	public void test1(){
		int[] arr = new int[]{2,3,4,45,6,34,546,8,9,3};
		System.out.println(arr[arr.length+1]);
	}
	
	/**
	 * 字符串下标越界
	 * java.lang.StringIndexOutOfBoundsException: String index out of range: 5
	 */
	@Test
	public void test2(){
		String ss = "zyd";
		System.out.println(ss.charAt(5));
	}
	
	/**
	 * 下标越界
	 * java.lang.IndexOutOfBoundsException: Index: 4, Size: 4
	 */
	@Test
	public void test3(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list.get(4));
	}
	
}
