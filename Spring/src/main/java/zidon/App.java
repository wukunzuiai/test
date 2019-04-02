package zidon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
	    /**
	     * 注解配置实现，同时指定配置类的位置，否则无法读取配置进行扫描，默认只有Spring自带的组件
	     */
	     ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CDConfig.class);
	     /**
	      *获取应用上下文中的所有Bean名称
	      */
	     String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
	     for (String className : beanDefinitionNames){
	       System.out.println(className);
	     }
	     /**
	      *从上下文（容器）中获取对应的Bean
	      */
	    CDPlayer cdPlayer = applicationContext.getBean(CDPlayer.class);
	    /**
	     *调用具体方法测试是否成功
	     */
	    cdPlayer.playCD();
	}

}
