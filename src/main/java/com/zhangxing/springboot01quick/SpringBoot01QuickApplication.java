package com.zhangxing.springboot01quick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/*
* @ImportResource可以让Spring的配置文件生效
* 但是这不是官方推荐方式-->推荐使用全注解的方式
* 配置类--配置文件
* */
@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringBoot01QuickApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot01QuickApplication.class, args);
	}

}
