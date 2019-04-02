package com.hesc.sifa.utils.test2;

import org.springframework.stereotype.Service;
/**
 * 
 * 
 * 根据自定义的注解，给所在的bean的特殊的方法标识上注解标识，好让切点反射处理方法过滤到
 *
 */
@Service
public class DemoAnnotetionService {

    @Action(name="自定义的注解拦截方法add")
    public void add(){
        System.out.println("调用注解方法类DemoAnnotetionService方法add:");
    }
}