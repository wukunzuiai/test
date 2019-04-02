package profile1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//1.创建一个配置类DevConfig，并将其作用域设置为dev，则其内定义的Bean只有在环境为dev的时候才可以被装载
@Configuration
@Profile(value = "dev")
public class DevConfig {

  //定义一个name属性为Dev DataSource的Bean
  @Bean
  public DataSource dataSource(){
      return new DataSource("Dev DataSource");
  }
}




