package com.gmail.aleksandrphilimonov.lesson4.homework.task1;

import com.gmail.aleksandrphilimonov.lesson4.homework.utils.ArrayUtils;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C"};
        System.out.println(Arrays.toString(array));
        ArrayUtils.swap(array, 0, 2);
        System.out.println(Arrays.toString(array));

        Double[] array2 = {1.23, 3.69, 6.4555};
        System.out.println(Arrays.toString(array2));
        ArrayUtils.swap2(array2, 0, 2);
        System.out.println(Arrays.toString(array2));
    }
}