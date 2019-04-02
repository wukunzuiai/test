package cn.daniel;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayerImpl2 implements CDPlayer{
	@Autowired
	private CDBean2 cdBean2;
    
	public void playCD() {
        System.out.println("正在播放："+cdBean2.getTitle()+" by "+cdBean2.getAuthor());
    }
}
