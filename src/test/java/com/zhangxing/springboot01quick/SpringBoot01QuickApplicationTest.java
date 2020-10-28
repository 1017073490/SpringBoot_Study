package com.zhangxing.springboot01quick;

import com.zhangxing.springboot01quick.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhangxing
 * @Description 单元测试
 * @date 2020/10/27 20:37
 *
 */

/*
* 可以在测试期间很方便的类似编码一样进行自动注入
* */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01QuickApplicationTest {

    //记录器
    Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void Test1(){
        System.out.println(person);
        System.out.println(ioc.containsBean("helloServiceByBean"));
    }

    @Test
    public void TestLog(){
        //日志级别,由低到高
        //可以调整输出的日志级别
        logger.trace("跟踪轨迹。。。");
        logger.debug("Debug日志");
        //默认使用info级别，但是可以在配置文件中指定
        //可以指定日输出到文件中
        logger.info("info日志");
        logger.warn("warn");
        logger.warn(person.toString());
        logger.error("出错啦！");
    }
}
