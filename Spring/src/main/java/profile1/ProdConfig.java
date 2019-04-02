package profile1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//2.创建一个配置类ProdConfig，并将其作用域设置为prod，则其内定义的Bean只有在环境为prod的时候才可以被装载
@Configuration
@Profile(value = "prod")
public class ProdConfig {

//定义一个name属性为Dev DataSource的Bean
@Bean(name="ccccccc")
public DataSource dataSource(){
    return new DataSource("Prod DataSource");
}
}