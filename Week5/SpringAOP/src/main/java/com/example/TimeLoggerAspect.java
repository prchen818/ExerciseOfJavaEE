package com.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class TimeLoggerAspect {
    @Pointcut("@annotation(com.example.TimeLogger)")
    public void pointcut(){
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp){
        Object ret = null;
        long startTime = System.currentTimeMillis();
        try {
            ret = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        long overTime = System.currentTimeMillis();
        System.out.printf("该方法执行耗时为%s毫秒%n", overTime - startTime);
        return ret;
    }

    @Before("pointcut()")
    public void before(){
        System.out.println("before func()执行...");
    }

    @After("pointcut()")
    public void after(){
        System.out.println("after func()执行...");
    }
}
