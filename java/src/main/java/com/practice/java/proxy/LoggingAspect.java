package com.practice.java.proxy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.practice.java.proxy.BookJPAService.*(..))")
    public void logBefore() {
        System.out.println("hello");
    }
}
