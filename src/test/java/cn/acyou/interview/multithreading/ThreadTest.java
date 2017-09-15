package cn.acyou.interview.multithreading;


/**
 * 写两个线程，一个线程循环打印0-9，一个线程循环打印a-z
 * <p>title：ThreadTest</p>
 * @author youfang
 * @date 2017年9月13日 上午11:41:35
 */
public class ThreadTest {

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			
			public void run() {
				for(int i = 0 ; i < 10 ; i++){
					System.out.println(i);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		};
		
		Runnable r2 = new Runnable() {
			public void run() {
				char c = 97;
				for(int i = 0 ; i < 32 ; i++){
					System.out.println(c);
					c++;
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
		
	}

}
