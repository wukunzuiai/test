package PropertySource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

//BaseConfig.class
@Configuration
@PropertySource("classpath:application.properties")
public class BeanConfig {

  @Autowired
  Environment environment;
  
  //定义bean并将环境中key为properties.name注入到BaseBean的构造函数参数中
  @Bean
  public BaseBean baseBean(){
      return new BaseBean(environment.getProperty("properties.name"));
  }
}
