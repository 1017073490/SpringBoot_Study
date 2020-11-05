package com.zhangxing.springboot01quick.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author zhangxing
 * @Description:
 * @date 2020/11/5 10:05
 */
@Component
public class HelloCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("zx...CommandLineRunner...run" + Arrays.asList(args));
    }
}
