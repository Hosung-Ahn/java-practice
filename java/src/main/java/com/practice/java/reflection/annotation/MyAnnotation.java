package com.practice.java.reflection.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
@Inherited
public @interface MyAnnotation {
    String name() default "name";
    int age() default 0;
}
