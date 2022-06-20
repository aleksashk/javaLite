package com.gmail.aleksandrphilimonov.lesson4.homework.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtils {
    public static <T> void swap(T[] array, int idx1, int idx2) {
        T temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

    public static void swap2(Object[] array, int idx1, int idx2) {
        Object temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

    public static <T> List<T> castArrayToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

}
