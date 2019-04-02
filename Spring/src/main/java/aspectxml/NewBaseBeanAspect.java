package aspectxml;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;

public class NewBaseBeanAspect {
 
    private Logger logger = Logger.getLogger(BaseBean.class);
    
    public void pointCut(){//被用于标识的空方法
    	System.out.println(">>>>>>>>>>>>pointcut");
    }
    
    public void beforeInvoke(){
        logger.debug("pointcut方法执行前");
    }
    
    public void aroundInvoke(ProceedingJoinPoint jp){
    	try {
           logger.debug("=====================环绕执行方法开始");
           Signature signature = jp.getSignature();
           String methodName = signature.getName();
           MethodSignature methodSignature = (MethodSignature) signature;
           logger.debug("方法名:{}"+methodName);
           List<Object> args = Arrays.asList(jp.getArgs());
           logger.debug("参数列表：{}"+args);
           Class<?> returnType = methodSignature.getMethod().getReturnType();
           logger.debug("方法返回类型：{}"+returnType);
           Object proceed = jp.proceed();
           logger.debug("======================环绕执行方法结束，方法执行结果:{}"+proceed);
         } catch (Throwable throwable) {
             throwable.printStackTrace();
         }
    }
    
     /**
      * 方法执行前的通知
      */
    /*@Before("execution(* aspectj.*.*(..))")
    public void beforeInvoke1(){
        logger.debug("方法执行前");
    }*/
 
    /**
     * 方法执行后的通知
     */
    public void afterInvoke(){
        logger.debug("方法执行后");
    }
    
    /**
     * 方法执行返回后的通知
     */
    public void afterReturning(){
        logger.debug("==================方法执行完成");
    }
    
    /**
     * 方法抛出异常的通知
     */
    public void afterThrowing(){
        logger.debug("==================方法执行报错");
    }
}
