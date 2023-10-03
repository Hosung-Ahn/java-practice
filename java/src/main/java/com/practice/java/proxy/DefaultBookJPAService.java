package com.practice.java.proxy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultBookJPAService implements BookJPAService{
    private final BookJPARepository bookJPARepository;

    @Override
    public void rent(BookJPA bookJPA) {
        System.out.println("rent : " + bookJPA.getTitle());
    }
}
