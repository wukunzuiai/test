package hunhe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.daniel.CDPlayer;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/xml/SystemConfig.xml");
		String[] beans = ac.getBeanDefinitionNames();
		for (String className : beans) {
			System.out.println(className);
		}
		/**
         * 从应用上下文中提取目标实体
         */
        CDPlayer cdPlayer = ac.getBean(CDPlayer.class);
        
        /**
         * 执行方法进行测试
         */
        cdPlayer.playCD();
	}
}
