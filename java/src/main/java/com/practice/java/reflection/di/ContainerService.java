package com.practice.java.reflection.di;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ContainerService {
    public static <T> T getObject(Class<T> classType) {
        T instance = getInstance(classType);
        Arrays.stream(classType.getDeclaredFields()).forEach(
                f -> {
                    if (f.getAnnotation(Inject.class) != null) {
                        Object fieldInstance = getInstance(f.getType());
                        f.setAccessible(true);
                        try {
                            f.set(instance, fieldInstance);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
        return instance;
    }

    private static <T> T getInstance(Class<T> classType)  {
        try {
            return classType.getConstructor().newInstance();
        }
        catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }
}
