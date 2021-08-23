package ru.postlife.java3.reflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

public class Tester {
    public static void main(String[] args) {
        Tester.start(Developer.class);
    }

    public static void start(Class clazz) {
        Method[] declaredMethods = clazz.getDeclaredMethods();
        if (Arrays.stream(declaredMethods).filter(method -> method.getAnnotation(BeforeSuite.class) != null).count() > 1) {
            throw new RuntimeException("Annotation " + BeforeSuite.class.getCanonicalName() + " is used more than 1 time");
        }
        if (Arrays.stream(declaredMethods).filter(method -> method.getAnnotation(AfterSuite.class) != null).count() > 1) {
            throw new RuntimeException("Annotation " + AfterSuite.class.getCanonicalName() + " is used more than 1 time");
        }

        Object obj = null;
        try {
            obj = clazz.getDeclaredConstructor().newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        final Object finalObj = obj;

        Arrays.stream(declaredMethods)
                .filter(method -> method.getAnnotation(BeforeSuite.class) != null)
                .forEach(method -> {
                    try {
                        System.out.println("BeforeSuite method");
                        method.invoke(finalObj);
                        System.out.println();
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                });

        Arrays.stream(declaredMethods)
                .filter(method -> method.getAnnotation(Test.class) != null
                        && method.getAnnotation(AfterSuite.class) == null
                        && method.getAnnotation(BeforeSuite.class) == null)
                .sorted((m1, m2) -> m2.getAnnotation(Test.class).priority() - m1.getAnnotation(Test.class).priority())
                .forEach(m -> {
                    try {
                        m.invoke(finalObj);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                });
        System.out.println();

        Arrays.stream(declaredMethods)
                .filter(method -> method.getAnnotation(AfterSuite.class) != null)
                .forEach(method -> {
                    try {
                        System.out.println("AfterSuite method");
                        method.invoke(finalObj);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                });
    }
}
