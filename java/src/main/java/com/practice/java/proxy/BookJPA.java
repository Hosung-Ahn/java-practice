package com.practice.java.proxy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class BookJPA {
    @Id @GeneratedValue
    private Long id;

    private String title;

    public BookJPA(String title) {
        this.title = title;
    }
}
