package com.zhangxing.springboot01quick;

import com.zhangxing.springboot01quick.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
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

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void Test1(){
        System.out.println(person);
        System.out.println(ioc.containsBean("helloServiceByBean"));
    }
}
