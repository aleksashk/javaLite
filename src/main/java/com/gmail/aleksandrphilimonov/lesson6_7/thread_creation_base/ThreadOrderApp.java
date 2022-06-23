package com.gmail.aleksandrphilimonov.lesson6_7.thread_creation_base;

public class ThreadOrderApp {
    public static void main(String[] args) {

        new Thread(() -> System.out.println(1)).start();

        new Thread(() -> System.out.println(2)).start();
    }
}
