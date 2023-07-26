package com.practice.java.reflection;

import java.util.Arrays;

public class app {

    public static void main(String[] args) throws ClassNotFoundException {
//        // 1
//        Class<Book> bookClass1 = Book.class;
//        // 2
//        Book book = new Book();
//        Class<? extends Book> bookClass2 = book.getClass();
//        // 3
//        Class<?> bookClass3 = Class.forName("com.practice.java.reflection.Book");
//        Arrays.stream(Book.class.getDeclaredFields()).forEach(System.out::println);
//
//        Book book = new Book();
//        Arrays.stream(Book.class.getDeclaredFields()).forEach(f ->
//        {
//            try {
//                f.setAccessible(true);
//                System.out.printf("%s -> %s\n", f, f.get(book));
//            } catch (IllegalAccessException e) {
//                throw new RuntimeException(e);
//            }
//        });


//        Arrays.stream(Book.class.getMethods()).forEach(System.out::println);
        Arrays.stream(Book.class.getConstructors()).forEach(System.out::println);
    }
}
