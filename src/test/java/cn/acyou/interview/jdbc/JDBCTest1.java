package cn.acyou.interview.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Test;


public class JDBCTest1 {

	@Test
	public void test1() throws Exception{
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取连接
		String url="jdbc:mysql://localhost:3306/iblog?useUnicode=true&characterEncoding=UTF-8";
		Connection conn = DriverManager.getConnection(url, "root", "yxserver");
		//创建statement
		Statement smt = conn.createStatement();
		String sql = "select * from ib_sort";
		ResultSet rs = smt.executeQuery(sql);
		while(rs.next()){
			String id = rs.getString(1);
			String name = rs.getString(2);
			System.out.println(id + "\t" + name);
		}
		smt.close();
		conn.close();
		
		
		
	}
	
	@Test
	public void test2(){
		 float a = 100F+10;
		System.out.println(a);
	}
	
	@Test
	public void test3(){
		List<Integer> list = new LinkedList<Integer>();
		for(int i = 0;i < 10;i++){
			list.add(i);
		}
		list.add(4);
		list.add(7);
		
/*		HashSet h = new HashSet(list);
		System.out.println("HashSet的值是：" + h);
		list.clear();
		list.addAll(h);
		System.out.println(list);*/
		
        List listTemp = new ArrayList();  
        for(int i=0;i<list.size();i++){  
            if(!listTemp.contains(list.get(i))){  
                listTemp.add(list.get(i));  
            }  
        } 
		System.out.println(listTemp);
		
	}
	
	

}
