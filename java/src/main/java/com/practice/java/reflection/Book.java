package com.practice.java.reflection;

import com.practice.java.reflection.annotation.MyAnnotation;

@MyAnnotation(name = "hosung", age = 26)
public class Book {
    private String privateVal = "privateVal";
    private final String privateFinalVal = "privateFinalVal";
    public String publicVal = "publicVal";

    public Book() {
    }

    public Book(String privateVal, String publicVal) {
        this.privateVal = privateVal;
        this.publicVal = publicVal;
    }

    private void privateMethod() {
        System.out.println("i am private method");
    }

    public void publicMethod() {
        System.out.println("i am public method");
    }
}
