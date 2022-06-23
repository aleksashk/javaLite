package com.gmail.aleksandrphilimonov.lesson6_7.race_condition;

public class RaceConditionApp {
    public static void main(String[] args) {
        Counter c = new Counter();
        Thread incThread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                c.inc();
            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread decThread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                c.dec();
            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        try {
            incThread.start();
            decThread.start();
            incThread.join();
            decThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Значение счётчика: " + c.value());
    }
}
