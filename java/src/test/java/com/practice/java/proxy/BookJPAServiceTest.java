package com.practice.java.proxy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookJPAServiceTest {
    @Autowired
    private BookJPAService bookJPAService;

    @Test
    public void di() {
        BookJPA object = new BookJPA("object");
        bookJPAService.rent(object);

    }
}