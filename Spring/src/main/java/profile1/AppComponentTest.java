package profile1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class,classes = {SystemConfig.class})
@ActiveProfiles("prod")//指定系统环境为prod
public class AppComponentTest {
 
    @Autowired
    private ApplicationContext applicationContext;
 
    @Test
    public void testGetBean(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
 
        for(String  beanName : beanDefinitionNames){
            System.out.println(beanName);
        }
        DataSource d = (DataSource) applicationContext.getBean("ccccccc");
        //DataSource d = applicationContext.getBean(DataSource.class);
        System.out.println(d.getName());
    }
}

 
 

 
