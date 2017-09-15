package cn.acyou.iblog.othertest;

public abstract class TestJuBuBianLiang {
	public static void main(String[] args) {
		int a=test1(3);
		System.out.println(a);
	}
	public static int test1(int n){
		if(n==1)return 10;
		if(n<0)return 0;
		return test1(n-1)+2;
	}
}
//n=3;test(2)+2;
//n=2;test(1)+2+2;