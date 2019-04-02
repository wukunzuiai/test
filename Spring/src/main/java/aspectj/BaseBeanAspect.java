package aspectj;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BaseBeanAspect {
 
    private Logger logger = Logger.getLogger(BaseBean.class);
    
    /*@Pointcut("execution(* aspectj.*.*(..))")
    public void pointCut(){//被用于标识的空方法
    	System.out.println(">>>>>>>>>>>>pointcut");
    }*/
    /**
     * 对指定注解，进行横切，创建一个横切的对象方法
     * 
     */
    @Pointcut("@annotation(aspect.AspectMsg)")
    public void pointCut(){};
    
    @Before("pointCut()")//以切点方法名引入
    public void beforeInvoke(){
        logger.debug("pointcut方法执行前");
    }
    
    
}
