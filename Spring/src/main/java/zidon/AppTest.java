package zidon;

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
    /**
     * 从Spring容器注入CdPlayer-----依赖注入
     */
    @Autowired
    private CDPlayer cdPlayer;
 
    /**
     * Rigorous Test :-)
     */
    @Test
    public void play()
    {
        //调用playCD方法测试是否自动装配及依赖注入成功
        this.cdPlayer.playCD();
    }
}
