package cglib;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

public class ProxyTest {

	@Test
	public void demo2() {
		// cglib 动态代理在目标业务类没有实现接口的情况下

		// 1、创建真实业务类的子类
		// cglib自带的字节码增强器
		Enhancer enhancer = new Enhancer();
		// 2、将委托类设置成父类
		enhancer.setSuperclass(Cat.class);

		MethodInterceptor methodInterceptor = new MethodInterceptorHandler();
		
		// 3、设置回调函数、拦截器
		enhancer.setCallback(methodInterceptor);
		Cat proxy = (Cat) enhancer.create();

		proxy.run();
	}
}
