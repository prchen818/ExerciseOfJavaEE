package com.example;

import org.springframework.stereotype.Component;

@Component
public class Test01 {

    @TimeLogger
    public void func(){
        System.out.println("func()正在执行...");
        int a=0;
        for (int i = 0; i < 10000; i++) {
            a+=i;
        }
    }
}
