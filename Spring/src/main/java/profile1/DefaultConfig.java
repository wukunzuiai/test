package profile1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//3.创建一个默认配置类，当系统未指定系统环境时，将默认使用该配置
@Configuration
public class DefaultConfig {
@Bean
public DataSource dataSource(){
    return new DataSource("Default DataSource");
}
}
