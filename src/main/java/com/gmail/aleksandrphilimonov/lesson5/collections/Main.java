package com.gmail.aleksandrphilimonov.lesson5.collections;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "11");
        map.put("2", "22");
        map.put("3", "33");
        map.put("4", "44");
        map.put("5", "55");
        map.put("6", "66");
        map.put("7", "77");
        map.put("8", "88");
//        map.put("9", "99");
//        map.put("10", "1010");
//        map.put("11", "1111");
//        map.put("12", "1212");
//        map.put("13", "1313");
//        Class hashMapClass = HashMap.class;
//        Field tableField = hashMapClass.getDeclaredField("table");
//        tableField.setAccessible(true);
//        int capacity = ((Object[])tableField.get(map)).length;
//        System.out.println(capacity);

        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        System.out.println(map.getOrDefault("4", "RRR"));
        System.out.println(map.getOrDefault("1234", "RRR"));
    }
}