package com.practice.java.proxy;

import com.practice.java.reflection.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookJPAService {
    private final BookRepository bookRepository;

    public void rent(BookJPA bookJPA) {
        System.out.println("rent : " + bookJPA.getTitle());
    }
}
