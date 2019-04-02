package gztest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/gz.xml");
		Person p = ac.getBean(Person.class);
		System.out.println(p.getAge()+":"+p.getName());
	}
}
