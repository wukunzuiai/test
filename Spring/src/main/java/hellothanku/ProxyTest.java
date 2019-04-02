package hellothanku;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.junit.Test;

public class ProxyTest {
	@Test
	public void method(){
		//创建业务对象
		Teacher teacher = new Daniel();
		//创建代理类对象
		InvocationHandler jdkproxy = new InVocationHandlerProxy(teacher);
		//创建代理对象
		Teacher proxy = (Teacher) Proxy.newProxyInstance(teacher.getClass().getClassLoader(), teacher.getClass().getInterfaces(), jdkproxy);
		proxy.teach();
	}
}
