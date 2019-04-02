package com.hesc.sifa.utils.test2;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import zhujieAspect.DemoAnnotetionService;
import zhujieAspect.DemoMethodService;

@RunWith(SpringJUnit4ClassRunner.class)//使用Spring提供的测试包进行测试，主要帮助实现bean的装载环境
@ContextConfiguration(loader = AnnotationConfigContextLoader.class,classes = {RootConfig.class})//配置类指向CDConfig
public class Test {
	@Autowired
    private DemoAnnotetionService demoAnnotetionService;

    @Autowired
    private DemoMethodService demoMethodService;

    @org.junit.Test
    public void usemethod() {
        System.out.println("Annotion test!!");
        demoAnnotetionService.add();
        demoMethodService.add();
        String message = "Annotion test from";
        System.out.println(message);
    }
}
