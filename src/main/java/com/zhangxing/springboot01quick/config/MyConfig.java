package com.zhangxing.springboot01quick.config;

import com.zhangxing.springboot01quick.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangxing
 * @Description: 配置类
 * @date 2020/10/27 21:30
 */
/*
 * 指明当前类是配置类，用于代替之前的Spring配置文件
 * 在之前的配置文件中，采用<bean>标签配置组件
 * 而配置类中，使用@Bean
 * */
@Configuration
public class MyConfig {

    //将方法的返回值添加到容器中,而这个组件默认的id就是方法名
    @Bean
    public HelloService helloServiceByBean() {
        return new HelloService();
    }
}
