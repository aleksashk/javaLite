package com.gmail.aleksandrphilimonov.lesson5.homework.task1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainApp {
    public static void main(String[] args) {
        String[] array = {"F", "AF", "AAF", "AF", "FF", "FD", "FDD", "AF", "FDD", "FFF", "F", "FF", "FDD", "FD", "FF",};
        System.out.println(Arrays.toString(array));
        Set<String> set = new HashSet<>(Arrays.asList(array));
        System.out.println(set);

        HashMap<String, Integer> map = new HashMap<>();
        for (String s : array) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + "\t->\t" + e.getValue());
        }
    }
}

