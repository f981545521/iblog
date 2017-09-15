package cn.acyou.interview;

import org.junit.Test;

public class TestString {
	
	@Test
	public void test1(){
		int c=7;
		int[] a={13,21,37,64,25,16,27,98,10,18};
		System.out.println(a.length);
		String str="";
		str.length();
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
			if(min>a[i]){
				min=a[i];
			}
		}
		System.out.println(min+","+max);
	}
	@Test
	public void test2(){
		int c=6;
		int a[]={1,2,3,4,5,6,7,8,9,10};
		
		
		int start=0;
		int end=a.length-1;
		while(start<=end){
			int mid=(start+end)/2;
			System.out.println("start:"+start+"end:"+end+"mid:"+mid);
			if(a[mid]>c){
				end=mid+1;
			}else if(a[mid]<c){
				start=mid+1;
			}else{
				System.out.println(mid);
				break;
			}
		}
	}
	
	@Test
	public void test3(){
		String[] str={"12","23"};
		int a=str.length;
		String ss="123";
		ss.length();
	}
	@Test
	public void test4(){
		System.out.println(Math.round(-11.5));
	}
	
	@Test
	public void test6(){
		System.out.println(23<<3);
	}
	
	@Test
	public void test7(){
		char c = 97;
		System.out.println(c);
	}
	
	@Test
	public void test8(){
		String[] str = new String[10];
		System.out.println(str[9]);
		System.out.println(str.length);
	}
	
	@Test
	public void test9(){
		String str = "i love u";
		//StringBuffer buff = new StringBuffer(str);
		//System.out.println(buff.reverse());
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
		
	}
	
	@Test
	public void test10(){
		String str = "want you know one things.n";
		int n = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='n'){
				n++;
			}
		}
		System.out.println(n);
	}
	
	
}
