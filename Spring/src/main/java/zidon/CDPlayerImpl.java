package zidon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "cdPlayer")//将当前类定义为可扫描的组件
public class CDPlayerImpl implements CDPlayer {
    /**
     * 从Spring容器注入CDBean-----依赖注入
     */
    @Autowired
    private CDBean cdBean;
 
    public void playCD() {
        System.out.println("正在播放："+cdBean.getTitle()+" by "+cdBean.getAuthor());
    }
}
