package com.gmail.aleksandrphilimonov.lesson4.homework.task2;

import com.gmail.aleksandrphilimonov.lesson4.homework.utils.ArrayUtils;

import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Integer[] array3 = {1, 2, 3, 4, 5};
        System.out.println("array: " + Arrays.toString(array3) + " is " + array3.getClass().getSimpleName());
        List<Integer> aList = ArrayUtils.castArrayToArrayList(array3);
        System.out.println("aList: " + aList + " is " + aList.getClass().getSimpleName());
    }
}
