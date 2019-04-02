package aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ComponentConfig.class);
		String[] beans = ac.getBeanDefinitionNames();
		for (String classname : beans) {
			System.out.println(classname);
		}
		BaseInterface baseInterface = ac.getBean(BaseInterface.class);
		baseInterface.addSong("myBean","mySong");
        baseInterface.delSong("myBean","mySong");
	}
}
