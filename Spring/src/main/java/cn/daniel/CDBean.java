package cn.daniel;

public class CDBean {

	/**
	 * 定义CD名
	 */
	private String title;

	/**
	 * 定义CD作者
	 */
	private String author;
	
	public CDBean(){}
	
	public CDBean(String title,String author){
		this.title=title;
		this.author=author;
	}

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
