package aspectj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class,classes = {ComponentConfig.class})
public class AppTest {
 
    @Autowired
    private BaseInterface baseInterface;
 
    @Test
    public void testBean(){
        baseInterface.addSong("myBean","mySong");
        baseInterface.delSong("myBean","mySong");
    }
}

