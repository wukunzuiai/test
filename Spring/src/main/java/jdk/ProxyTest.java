package jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void demo1() {
		// JDK自动代理的原理是根据类加载器和接口创建代理类（此代理类是接口的实现类，所以必须使用接口）

		// 1、 创建目标业务对象的引用
		Fly fly = new Bird();
		// 2、使用目标业务对象类加载器和接口，在内存中创建代理对象
		Fly proxy = (Fly) Proxy.newProxyInstance(fly.getClass().getClassLoader(), fly.getClass().getInterfaces(),
				new InvocationHandler() {
					// 3、实现InvocationHandler接口
					/**
			    	* proxy:代理类代理的真实代理对象com.sun.proxy.$Proxy0
			    	* method:我们所要调用某个对象真实的方法的Method对象
			    	* args:指代代理对象方法传递的参数
			    	*/
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// 拦截方法
						if (method.getName().equals("gotoFly")) {
							System.out.println("被拦截了，鸟飞不走了。。。");
							return null;
						}
						// 不拦截就invoke
						return method.invoke(proxy, args);
					}
				});

		proxy.gotoFly();
	}
}
