package com.gmail.aleksandrphilimonov.lesson6.homework;

import java.util.Arrays;

public class MainAppPart1 {

    public static void main(String[] args) {
        firstMethod();
        secondMethod();
    }

    private static void firstMethod() {
        final int SIZE = 10000000;
        float[] arr = new float[SIZE];

        Arrays.fill(arr, 1.f);

        long timer = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - timer);
    }

    private static void secondMethod() {
        final int SIZE = 10000000;
        final int HALF = SIZE / 2;
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1);

        long timer = System.currentTimeMillis();

        float[] array1 = new float[HALF];
        float[] array2 = new float[HALF];

        System.arraycopy(arr, 0, array1, 0, HALF);
        System.arraycopy(arr, HALF, array2, 0, HALF);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < array1.length; i++) {
                array1[i] = (float) (array1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0, j = HALF; i < array2.length; i++, j++) {
                array2[i] = (float) (array2[i] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.arraycopy(array2, 0, arr, 0, HALF);
        System.arraycopy(array1, 0, arr, HALF, HALF);

        System.out.println(System.currentTimeMillis() - timer);
    }
}