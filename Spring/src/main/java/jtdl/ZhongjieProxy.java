package jtdl;
//某租房中介
public class ZhongjieProxy implements RichPeople{
	//客户
	private RichPeople richPeople;
	
	public ZhongjieProxy(){}
	
	public ZhongjieProxy(RichPeople richPeople){
		this.richPeople = richPeople;
	}

	/**
	 * 中介公司帮忙找租客
	 */
	public void zufang() {
		System.out.println("帮客户找租客。。。顾客就是上帝。。。");
	}

	/**
	 * 租金让客户自己去收
	 */
	public void getmoney() {
		richPeople.getmoney();
	}

}
