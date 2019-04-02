package cn.daniel;

import org.springframework.stereotype.Component;

@Component//将当前类定义为可扫描的组件
public class CDBean2 {
    /**
     * 定义CD名
     */
    private String title="The World!";
    
    /**
    * 定义CD作者
    */
    private String author="Mr.D";

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
    
}

