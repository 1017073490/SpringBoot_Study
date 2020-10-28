package com.zhangxing.springboot01quick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/*
* @ImportResource可以让Spring的配置文件生效
* 但是这不是官方推荐方式-->推荐使用全注解的方式
* 配置类--配置文件
*
* 配置文件的加载优先级：自上而下依次减小，（springboot启动时会扫描一下位置的配置文件.properties/.yml）
* 其中高》低，互补配置
* -file:./config/
* -file:./
* -classpath:./config/
* -classpath:./
*
* 外部配置加载顺序：
* 、、、
* 先加载带profile
* 由jar包外->jar包内
* */
@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
/*
* 精髓：
* springboot启动会加载大量的自动配置类
* 我们可看我们需要的功能有没有SpringBoot默认写好的配置类
* 再看这个自动配置类中到底配置了哪些组件，只要组件中有，我们就不需要再配置。
* 给容器中自动配置类添加组件的时候，会从properties类中获取某些属性，我们就可以在配置文件中指定这些属性的值；
*
* ------
* springboot选用的日志技术是：SLF4j（抽象层）+logback（实现层），并把其他日志都替换成了SLF4j
* 如何使用：日志记录方法的调用应该选择调用日志抽象层里的方法
* 日志实现框架都有自己的配置文件，使用SLF4j以后，配置文件还是做实现框架的配置文件。
*
*
* */
public class SpringBoot01QuickApplication {
	/*
	* 自动配置原理：
	* 1）
	* */

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot01QuickApplication.class, args);
	}

}
