package jtdl;

import org.junit.Test;

public class ProxyTest {
	@Test
	public void method(){
		//有钱人张三
		RichPeople zhangsan = new People("张三");
		//有钱人李四
		RichPeople lisi = new People("李四");
		
		//张三自己找租客收租金
		zhangsan.zufang();
		zhangsan.getmoney();
		//李四找中介公司收租金
		ZhongjieProxy zhongjie = new ZhongjieProxy(lisi);
		zhongjie.zufang();
		zhongjie.getmoney();
	}
}
