package cn.acyou.interview;

public class TestCoding {
	
	public static void main(String[] args) {
		show(3);
	}
	
	public static void show(int n){
		for(int i=1;i<=n;i++){
			StringBuilder sb=new StringBuilder("*");
			for(int k=2;k<=i;k++){
				sb.append(".");
			}
			for(int j=1;j<=i;j++){
				System.out.print(sb);
			}
			System.out.println();
		}
	}
}
