package com.hesc.sifa.utils.test2;

import org.springframework.context.annotation.ComponentScan; 
import org.springframework.context.annotation.ComponentScan.Filter; 
import org.springframework.context.annotation.Configuration; 
import org.springframework.context.annotation.EnableAspectJAutoProxy; 

import org.springframework.context.annotation.FilterType;

@Configuration 
@ComponentScan( basePackages={"com.hesc.sifa.utils"}) 
@EnableAspectJAutoProxy//开启切面的支持 
public class RootConfig {

}
