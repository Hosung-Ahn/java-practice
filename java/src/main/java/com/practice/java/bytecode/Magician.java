package com.practice.java.bytecode;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.pool.TypePool;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Magician {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Hat.class.getClassLoader();
        TypePool typePool = TypePool.Default.of(classLoader);


        new ByteBuddy().redefine(
                        typePool.describe("com.practice.java.bytecode.Hat").resolve(),
                        ClassFileLocator.ForClassLoader.of(classLoader)
                )
                .method(named("pullOut")).intercept(FixedValue.value("Rabbit"))
                .make().saveIn(new File("/Users/hosung/Workspace/java-practice/java/build/classes/java/main/"));

        Hat hat = new Hat();
        System.out.println("result : " + hat.pullOut());
    }
}
