package profile1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		//method1();
		method2();
	}
	private static void method2(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("/profilexml/SystemConfig.xml");
		String[] beans = ac.getBeanDefinitionNames();
		for (String classname : beans) {
			System.out.println(classname);
		}
		DataSource ds = ac.getBean(DataSource.class);
		System.out.println(ds.getName());
	}
	private static void method1(){
		ApplicationContext ac = new AnnotationConfigApplicationContext(SystemConfig.class);
		String[] beans = ac.getBeanDefinitionNames();
		for (String classname : beans) {
			System.out.println(classname);
		}
		DataSource ds = ac.getBean(DataSource.class);
		System.out.println(ds.getName());
	}
}
