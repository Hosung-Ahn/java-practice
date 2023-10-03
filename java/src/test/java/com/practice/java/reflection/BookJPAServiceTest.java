package com.practice.java.reflection;

import com.practice.java.proxy.BookJPA;
import com.practice.java.proxy.BookJPAService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class BookJPAServiceTest {
    @Qualifier("bookServiceProxy")
    @Autowired
    BookJPAService bookService;

    @Test
    public void di() {
        BookJPA book = new BookJPA();
        book.setTitle("Spring");
        bookService.rent(book);
    }
}