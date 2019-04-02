package spEL;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;


@RunWith(SpringJUnit4ClassRunner.class)//辅助创建Spring应用上下文
@ContextConfiguration(loader = AnnotationConfigContextLoader.class,classes = {CDConfig.class})//指定创建上下文的加载方式以及配置的位置
public class AppTest 
{
	@Autowired
	private SonBean sb;
	
	@Test
	public void test(){
		System.out.println(sb.getSonName());
	}
}
