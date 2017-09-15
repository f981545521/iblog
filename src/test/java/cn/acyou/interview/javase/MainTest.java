package cn.acyou.interview.javase;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;
/**
 * 测试Java中Comparable和Comparator
 * <p>title：MainTest</p>
 * @author youfang
 * @date 2017年9月4日 下午2:17:43
 * 总结：
 * Comparable是排序接口，若一个类实现了Comparable接口，就意味着“该类支持排序”。
 * Comparator是比较器，我们若需要控制某个类的次序，可以建立一个“该类的比较器”来进行排序。
 * Comparable相当于“内部比较器”，而Comparator相当于“外部比较器”。
 * 
 * 用Comparable 简单， 只要实现Comparable 接口的对象直接就成为一个可以比较的对象，但是需要修改源代码。
 * 用Comparator 的好处是不需要修改源代码， 而是另外实现一个比较器， 当某个自定义的对象需要作比较的时候，把比较器和对象一起传递过去就可以比大小了。
 * 
 * 使用方法：
 * Comparable：比较对象的实体类实现Comparable接口，重写comoareTo方法；这也是默认比较对象的方式；
 * Comparator：写一个比较器类，实现Comparator接口；重写compare方法；在使用排序方法的时候传入；
 * 
 */
public class MainTest {

	@Test
	public void test1(){
        Person[] people=new Person[]{new Person("xujian", 20),new Person("xiewei", 10),new Person("张三", 18)};
        System.out.println("排序前");
        for (Person person : people)
        {
            System.out.print(person.getName()+":"+person.getAge());
        }
        //
        Arrays.sort(people);
        
        System.out.println("\n排序后");
        for (Person person : people)
        {
            System.out.print(person.getName()+":"+person.getAge());
        }
	}
	
	@Test
	public void test2(){
        Person2[] peoples=new Person2[]{new Person2("xujian", 20),new Person2("xiewei", 10),new Person2("张三", 18)};
        System.out.println("排序前");
        for (Person2 person : peoples)
        {
            System.out.print(person.getName()+":"+person.getAge());
        }
        /**
         * 写一个比较器类：实现Comparator接口；重写compare方法；在使用排序方法的时候传入；
         * <p>title：PersonCompartor</p>
         * @author youfang
         * @date 2017年9月4日 下午2:24:17
         */
        class PersonCompartor implements Comparator<Person2>{
        	/**
        	 * 重写compare方法：
        	 * int compare(T o1, T o2) 是“比较o1和o2的大小”。
        	 * 返回“负数”，意味着“o1比o2小”；返回“零”，意味着“o1等于o2”；返回“正数”，意味着“o1大于o2”。
        	 * @param o1
        	 * @param o2
        	 * @return
        	 * @author youfang
        	 * @date 2017年9月4日 下午2:25:43
        	 */
			public int compare(Person2 o1, Person2 o2) {
				return o1.getAge() - o2.getAge();
			}
        	
        }
        Arrays.sort(peoples, new PersonCompartor());
        System.out.println("排序后");
        for (Person2 person : peoples)
        {
            System.out.print(person.getName()+":"+person.getAge());
        }
	}
	
	
	@Test
	public void test3(){
		float f = 100/10;
		System.out.println(Integer.MAX_VALUE);
	}
	
	@Test
	public void test4(){
		int i = 1;
		int j = 1;
		System.out.println(++i);//2
		
		System.out.println(j++);//1
		
		System.out.println(i + "," + j);//2,2
	}
	
	@Test
	public void test5(){

		int i = 1;
		int j = 1;
		System.out.println((i++!=1)&&(++j==2));//且假必假
		System.out.println("i="+i+";j="+j);
		
	}
	
	
}


