package cn.acyou.interview.javase;

public class Person implements Comparable<Person>{

	String name;
	int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/**
	 * 继承Comparable接口重写compareTo方法；
	 * @param o
	 * @return
	 * @author youfang
	 * @date 2017年9月4日 下午2:09:35
	 */
	public int compareTo(Person o) {
		return this.age-o.age;
	}
	
	

}
