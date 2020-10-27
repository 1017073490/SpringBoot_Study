package com.zhangxing.springboot01quick.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangxing
 * @Description: 接受并返回
 * @date 2020/10/27 15:02
 */
@Controller
@ResponseBody
public class HelloController {

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        return "我是自动配置";
    }

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "你好" + name;
    }
}
