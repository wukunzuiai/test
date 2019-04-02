package com.hesc.sifa.utils.test2;
import java.lang.reflect.Method;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    /**
     * 对指定注解，进行横切，创建一个横切的对象方法
     * 
     */
    @Pointcut("@annotation(com.hesc.sifa.utils.test2.Action)")
    public void annotationPoint(){};


    /**
     * 对横切方法，进行反射处理，对使用了注解方法“前”：不仅可以捕捉到注解内容，还有方法名等，
     * 此处的作用主要是：可以对使用注解使用的方法，进行方法特殊逻辑处理（可以具体到哪个方法使用了哪个注解内容进行特殊处理）
     * 
     */
    @Before("annotationPoint()")
    public void BeforeAnnotation(JoinPoint joinPoint){
        MethodSignature signature=(MethodSignature) joinPoint.getSignature();
        Method method=signature.getMethod();
        Action action=method.getAnnotation(Action.class);
        System.out.println("注解的拦截方法名注解内容前："+action.name());
    }

    /**
     * 对横切方法，进行反射处理，对使用了注解方法“后”：不仅可以捕捉到注解内容，还有方法名等，
     * 此处的作用主要是：可以对使用注解使用的方法，进行方法特殊逻辑处理（可以具体到哪个方法使用了哪个注解内容进行特殊处理）
     * 
     */
    @After("annotationPoint()")
    public void AfterAnnotation(JoinPoint joinPoint){
        MethodSignature signature=(MethodSignature) joinPoint.getSignature();
        Method method=signature.getMethod();
        Action action=method.getAnnotation(Action.class);
        System.out.println("注解的拦截方法名注解内容后："+action.name());
    }
}