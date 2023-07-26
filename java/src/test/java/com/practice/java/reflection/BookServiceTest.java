package com.practice.java.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void di() {
        assertThat(bookService).isNotNull();
    }
}