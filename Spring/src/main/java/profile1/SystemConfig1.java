package profile1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class SystemConfig1 {
 
    @Bean(name="aaaaaaaaaaa")
    @Profile("dev")//当系统环境为dev的时候，使用该Bean方法进行装配
    public DataSource devDataSource(){
        return new DataSource("Dev DataSource");
    }
 
    @Bean
    @Profile("prod")//当系统环境为prod的时候，使用该Bean方法进行装配
    public DataSource prodDataSource(){
        return new DataSource("Prod DataSource");
    }
    
    @Bean(name="bbbbbbbbbbbbbbb")//默认装配
    public DataSource defaultDataSource(){
        return new DataSource("Default DataSource");
    }
}
