package com.company;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//reflection
//этот класс должен брать из аннотации все дела и в метод их
public class Tester {
    public static void test(Class<?>... ls) {
        try {
        for (Class<?> cls : ls) {
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Test.class)) {
                    Object omc = new OneMoreClass();

                    Test test = method.getAnnotation(Test.class);
                    int res = (Integer) method.invoke(omc, test.a(), test.b());
                    System.out.println(res);
                }
            }
        }

        } catch (IllegalAccessException | InvocationTargetException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
