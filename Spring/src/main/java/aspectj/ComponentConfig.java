package aspectj;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;

@Configuration
@EnableAspectJAutoProxy//开启自动代理开关，启用切面
@ComponentScan(basePackages = {"aspectj"})
public class ComponentConfig {
}
