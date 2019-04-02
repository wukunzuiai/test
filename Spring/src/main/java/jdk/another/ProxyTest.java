package jdk.another;

import java.lang.reflect.Field;
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
		// 2、创建一个代理类对象
		InvocationHandler handler = new InvocationHandlerProxy(fly);
		// 3、使用目标业务对象类加载器和接口，在内存中创建代理对象
		Fly proxy = (Fly) Proxy.newProxyInstance(fly.getClass().getClassLoader(), fly.getClass().getInterfaces(),
				handler);
		
		//这里可以通过运行结果证明proxy是Proxy的一个实例，这个实例实现了Fly接口  
        System.out.println(proxy instanceof Proxy);  
        
        //这里可以看出proxy的Class类是$Proxy0,这个$Proxy0类继承了Proxy，实现了Fly接口  
        System.out.println("proxy的Class类是："+proxy.getClass().toString());  
        
        System.out.print("proxy中的属性有：");  
        
        Field[] field=proxy.getClass().getDeclaredFields();  
        for(Field f:field){  
            System.out.print(f.getName()+", ");  
        }  
          
        System.out.print("\n"+"proxy中的方法有：");  
          
        Method[] method=proxy.getClass().getDeclaredMethods();  
          
        for(Method m:method){  
            System.out.print(m.getName()+", ");  
        }  
          
        System.out.println("\n"+"proxy的父类是："+proxy.getClass().getSuperclass());  
          
        System.out.print("\n"+"proxy实现的接口是：");  
          
        Class<?>[] interfaces=proxy.getClass().getInterfaces();  
          
        for(Class<?> i:interfaces){  
            System.out.print(i.getName()+", ");  
        }  
  
        System.out.println("\n\n"+"运行结果为：");  
		proxy.gotoFly();
	}
}
