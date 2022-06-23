package com.gmail.aleksandrphilimonov.lesson6_7.synchronization;

public class ChairsApp {
    public static void main(String[] args) throws Exception {

        Object стул1 = new Object();
        Object стул2 = new Object();

        Thread человек1 = new Thread(() -> {
            System.out.println("Чел1 подошел к стул1");
            synchronized (стул1) {
                System.out.println("Чел1 сел на стул1");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Чел1 встал со стул1");
            }
        });
        человек1.start();

        Thread человек2 = new Thread(() -> {
            System.out.println("Чел2 подошел к стул1");
            synchronized (стул1) {
                System.out.println("Чел2 сел на стул1");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Чел2 встал со стул1");
            }
        });
        человек2.start();

        Thread человек3 = new Thread(() -> {
            System.out.println("Чел3 подошел к стул1");
            synchronized (стул1) {
                System.out.println("Чел3 сел на стул1");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Чел3 встал со стул1");
            }
        });
        человек3.start();

        Thread человек4 = new Thread(() -> {
            System.out.println("Чел4 подошел к стул2");
            synchronized (стул2) {
                System.out.println("Чел4 сел на стул2");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Чел4 встал со стул2");
            }
        });
        человек4.start();
    }
}
