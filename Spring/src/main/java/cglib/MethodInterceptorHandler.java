package cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MethodInterceptorHandler implements MethodInterceptor{
	/**
	 * 前三个参数同jdk方式
     * methodProxy，委托类中的每一个被代理方法都对应一个MethodProxy对象
	 */
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		//拦截方法
		if (method.getName().equals("run")) {
			System.out.println("cat的run方法被拦截了。。。。");
			return null;
		}
		
		// MethodProxy为cgli生成的对象，性能更高也体现在此
		return methodProxy.invokeSuper(proxy, args);
	}

}
