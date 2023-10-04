package com.practice.java.reflection;


import com.practice.java.proxy.BookJPA;
import com.practice.java.proxy.BookJPAService;
import com.practice.java.proxy.DefaultBookJPAService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@SpringBootTest
public class DynamicProxyTest {

    @Qualifier("defaultBookJPAService")
    @Autowired
    BookJPAService bookService;

    @Test
    void test1() {
        BookJPA spring = new BookJPA("Spring");
        bookService.rent(spring);
        bookService.rent(spring);
    }
}
