package com.gmail.aleksandrphilimonov.lesson9.reflection_api;

public class TestMethod {
    @MyAnnotation(priority = 3)
    public static void method1() {
        System.out.println("Method 1");
    }

    @MyAnnotation(priority = 4)
    public static void method2() {
        System.out.println("Method 2");
    }

    @MyAnnotation(priority = 2)
    public static void method3() {
        System.out.println("Method 3");
    }
}
