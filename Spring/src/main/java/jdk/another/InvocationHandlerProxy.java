package jdk.another;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerProxy implements InvocationHandler{
	private Object obj;
	
	public InvocationHandlerProxy(){}
	
	public InvocationHandlerProxy(Object obj){
		this.obj = obj;
	}
	
	/**
	 * proxy:代理类代理的真实代理对象com.sun.proxy.$Proxy0
	 * method:我们所要调用某个对象真实的方法的Method对象
	 * rgs:指代代理对象方法传递的参数
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 拦截方法
		if (method.getName().equals("gotoFly1")) {
			System.out.println("被拦截了，鸟飞不走了。。。");
			return null;
		}
		// 不拦截就invoke
		return method.invoke(obj, args);
	}

}
