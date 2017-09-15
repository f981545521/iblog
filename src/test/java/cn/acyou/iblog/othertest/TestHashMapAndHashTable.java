package cn.acyou.iblog.othertest;

import java.util.HashMap;
import java.util.Hashtable;

import org.junit.Test;

public class TestHashMapAndHashTable {
	
	@Test
	public void test1(){
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put(null, null);
		map.put("a", 1);
		map.put("o", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		System.out.println(map);
	}
	@Test
	public void test3(){
		Hashtable<String, Integer> tab=new Hashtable<String, Integer>();
		tab.put("a", 1);
		tab.put("o", 2);
		tab.put("c", 3);
		tab.put("d", 4);
		tab.put("e", 5);
		System.out.println(tab);
	}
	
	@Test
	public void test4(){
		String str1="hello";
		String str2="he"+new String("llo");
		System.out.println(str1==str2);
	}
	
	@Test
	public void test5(){
		double b=0.9239d;
	}
	
	
	
	
	
	
	
	
}
