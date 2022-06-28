package com.gmail.aleksandrphilimonov.tempPackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {

        String[] words = {"AAA", "A", "AAA"};
        String result = Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(e -> e.getValue()))
                .get()
                .getKey();
        System.out.println(result);
    }
}

















