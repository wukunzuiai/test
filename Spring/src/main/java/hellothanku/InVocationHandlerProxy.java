package hellothanku;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InVocationHandlerProxy implements InvocationHandler{
	private Object obj;
	
	public InVocationHandlerProxy(){}
	
	public InVocationHandlerProxy(Object obj){
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//拦截
		if("teach".equals(method.getName())){
			System.out.println("Mr.Daniel is eil");
			return null;
		}
		return method.invoke(obj, args);
	}

}
