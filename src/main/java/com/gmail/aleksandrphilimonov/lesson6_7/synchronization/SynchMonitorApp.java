package com.gmail.aleksandrphilimonov.lesson6_7.synchronization;

public class SynchMonitorApp {
    private Object monitor = new Object();

    public static void main(String[] args) {
        SynchMonitorApp e2 = new SynchMonitorApp();
        new Thread(() -> e2.method()).start();
        new Thread(() -> e2.method()).start();
        new Thread(() -> e2.method()).start();
    }

    public void method() {
        try {
            System.out.println("NonSync-Begin " + Thread.currentThread());
            for (int i = 0; i < 3; i++) {
                System.out.println(" . ");
                Thread.sleep(1000);
            }
            System.out.println("NonSync-End " + Thread.currentThread());
            synchronized (monitor) {
                System.out.println("Sync-Begin " + Thread.currentThread());
                for (int i = 0; i < 3; i++) {
                    System.out.println(" . ");
                    Thread.sleep(1000);
                }
                System.out.println("Sync-End " + Thread.currentThread());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
