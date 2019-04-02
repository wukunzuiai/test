package zhujieAspect;

import org.springframework.context.annotation.ComponentScan; 
import org.springframework.context.annotation.ComponentScan.Filter; 
import org.springframework.context.annotation.Configuration; 
import org.springframework.context.annotation.EnableAspectJAutoProxy; 

import org.springframework.context.annotation.FilterType;

@Configuration 
@ComponentScan( basePackages={"zhujieAspect"}) 
@EnableAspectJAutoProxy//开启切面的支持 
public class RootConfig {

}
