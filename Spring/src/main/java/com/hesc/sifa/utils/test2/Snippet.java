package com.hesc.sifa.utils.test2;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;

public class Snippet {
	/**
	     * 对包下类的所有方法执行前，进行横切
	     * 
	     */
	    //注意，*需要空格，不然将会报错
	    @Before("execution(* com.hesc.sifa.utils.test2.DemoMethodService.*(..))")
	    public void BeforeDemoMethod (JoinPoint joinPoint){
	          MethodSignature signature=(MethodSignature) joinPoint.getSignature();
	          Method method=signature.getMethod();
	          //此处可以根据一些特殊的方法进行处理逻辑
	          System.out.println("方法拦截的方法名字前："+method.getName());
	    }
	
	    //注意，*需要空格，不然将会报错
	    @After("execution(* com.hesc.sifa.utils.test2.DemoMethodService.*(..))")
	    public void AfterDemoMethod (JoinPoint joinPoint){
	          MethodSignature signature=(MethodSignature) joinPoint.getSignature();
	          Method method=signature.getMethod();
	          //此处可以根据一些特殊的方法进行处理逻辑
	          System.out.println("方法拦截的方法名字后："+method.getName());
	    }
}

