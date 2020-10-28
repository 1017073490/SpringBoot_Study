package com.zhangxing.springboot01quick.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangxing
 * @Description: 测试访问路径
 * @date 2020/10/28 9:15
 */
@Controller
@ResponseBody
public class ContextController {

    @RequestMapping("/context")
    public String context(){
        return "你好配置";
    }
}
