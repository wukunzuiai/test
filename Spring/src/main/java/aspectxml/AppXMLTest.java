package aspectxml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import aspectj.BaseInterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:aspectxml.xml"})//将配置文件作为装配环境
public class AppXMLTest {
 
    @Autowired
    private BaseInterface baseInterface;
 
    @Test
    public void testBean(){
        baseInterface.addSong("Mr D","The World!!");
        baseInterface.delSong("Mr D","The World!!");
    }
}

