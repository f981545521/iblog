package cn.acyou.interview.javase;

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

}
