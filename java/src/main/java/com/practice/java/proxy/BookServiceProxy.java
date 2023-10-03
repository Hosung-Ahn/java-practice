package com.practice.java.proxy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceProxy implements BookJPAService{
    private final BookJPAService bookService;
    @Override
    public void rent(BookJPA bookJPA) {
        System.out.println("service start");
        bookService.rent(bookJPA);
        System.out.println("service end");

    }
}
