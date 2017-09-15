package cn.acyou.interview.design;

/**
 * 懒汉式单例类.在第一次调用的时候实例化自己   
 * <p>title：Singleton</p>
 * @author youfang
 * @date 2017年9月12日 上午11:52:14
 */
public class Singleton {
	
	private static Singleton single = null;
	
	private Singleton() {
		
	}

	// 静态工厂方法
	public static Singleton getInstance() {
		if (single == null) {
			single = new Singleton();
		}
		return single;
	}
}













