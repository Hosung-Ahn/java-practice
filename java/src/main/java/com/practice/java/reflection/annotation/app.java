package com.practice.java.reflection.annotation;

import com.practice.java.reflection.Book;

import java.util.Arrays;

public class app {
    public static void main(String[] args) {
//        Arrays.stream(Book.class.getAnnotations()).forEach(System.out::println);

        Arrays.stream(Book.class.getAnnotations()).forEach(
                annotation -> {
                    if (annotation instanceof MyAnnotation myAnnotation) {
                        System.out.println(myAnnotation.name());
                        System.out.println(myAnnotation.age());
                    }
                }
        );



    }
}
