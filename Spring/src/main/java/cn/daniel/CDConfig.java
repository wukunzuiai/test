package cn.daniel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//标明配置
public class CDConfig {
 
    @Bean(name = {"CDBEAN"})
    public CDBean cdBean(){
        return new CDBean("Beat It","MJ");
    }
 
    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayerImpl(cdBean());
    }
}

