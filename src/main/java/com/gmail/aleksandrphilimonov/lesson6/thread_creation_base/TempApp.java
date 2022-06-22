package com.gmail.aleksandrphilimonov.lesson6.thread_creation_base;

public class TempApp {
    public static void main(String[] args) {
        int w = 5;
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(w)).start();
        }
    }
}
