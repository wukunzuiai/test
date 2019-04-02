package cn.daniel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main(String[] args) {
    	//method1();
    	method2();
    }
    private static void method2(){
    	/**
         * 从根目录的application.xml文件中构建应用上下文
         */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CDConfig.class);
        
        /**
        *从应用上下文中获取所有bean的类名
        */
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String className : beanDefinitionNames){
            System.out.println(className);
        }
        /*CDBean cdbean = applicationContext.getBean(CDBean.class);
        System.out.println(cdbean.getTitle());*/
        
        /**
         * 从应用上下文中提取目标实体
         */
        CDPlayer cdPlayer = applicationContext.getBean(CDPlayer.class);
        
        /**
         * 执行方法进行测试
         */
        cdPlayer.playCD();
    }
    
    private static void method1(){
    	/**
         * 从根目录的application.xml文件中构建应用上下文
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/application.xml");
        
        /**
        *从应用上下文中获取所有bean的类名
        */
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String className : beanDefinitionNames){
            System.out.println(className);
        }
        /*CDBean cdbean = applicationContext.getBean(CDBean.class);
        System.out.println(cdbean.getTitle());*/
        
        /**
         * 从应用上下文中提取目标实体
         */
        CDPlayer cdPlayer = applicationContext.getBean(CDPlayer.class);
        
        /**
         * 执行方法进行测试
         */
        cdPlayer.playCD();
    }
}
