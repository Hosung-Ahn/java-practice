package com.practice.java.proxy;

import com.practice.java.reflection.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

public interface BookJPAService {
    void rent(BookJPA bookJPA);
}
