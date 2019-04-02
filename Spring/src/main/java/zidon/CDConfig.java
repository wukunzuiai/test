package zidon;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages = {"com.my.spring","com.my.test"})//指定扫描com.my.spring包和com.my.test包及其子包下的组件
//@ComponentScan(basePackageClasses = {App.class})//指定扫描App.class所在包及其子包下的组件
@ComponentScan//仅能扫描自身所在包及其子包的组件
@Configuration
public class CDConfig {}
//注：通常，为了防止因包路径更改以及业务实体类更改等因耦合而产生的问题，我们通常会使用一个不具备任何业务意义的空接口作为扫描包的类


