package beanLifeCycle;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	@Test
	public void method(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		System.out.println("Spring容器初始化");
		
		//MyEmployeeService service = ctx.getBean("myEmployeeService", MyEmployeeService.class);
		EmployeeService service = ctx.getBean("employeeService", EmployeeService.class);

		System.out.println("Bean retrieved from Spring Context");
		
		System.out.println("Employee Name="+service.getEmployee().getName());
		
		ctx.close();
		System.out.println("Spring Context Closed");
	}
}

