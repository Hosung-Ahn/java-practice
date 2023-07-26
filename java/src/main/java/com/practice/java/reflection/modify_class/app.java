package com.practice.java.reflection.modify_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class app {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<Book> bookClass = Book.class;
        Constructor<Book> constructor = bookClass.getConstructor(String.class, String.class);
        Book book = constructor.newInstance("hello", "world");

        Field privateFinalVal = Book.class.getDeclaredField("privateFinalVal");
        privateFinalVal.setAccessible(true);
        System.out.println(privateFinalVal.get(book));
        privateFinalVal.set(book, "privateFinalVal changed");
        System.out.println(privateFinalVal.get(book));

        Method privateMethod = Book.class.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(book);
    }
}
