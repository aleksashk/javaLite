package com.gmail.aleksandrphilimonov.lesson4.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("A", "B","f", "23", "D","ZZ", "D", "D", "D", "C", "D"));
//        System.out.println(arrayList);
//        System.out.println(arrayList.get(3));
////        System.out.println(arrayList.get(32));
//        System.out.println(arrayList.size());
//        int i = 0;
//        for (String s : arrayList) {
//            System.out.println(s + " is number " + ++i);

        List<Integer> aList = new ArrayList<>(1000000);
        List<Integer> lList = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 1000000; k++) {
                int x = r.nextInt(50000);
                aList.add(x);
                lList.add(x);
            }

            long time1 = System.currentTimeMillis();
            Collections.sort(lList);
            System.out.println("l_time: " + (System.currentTimeMillis() - time1));
            long time2 = System.currentTimeMillis();
            Collections.sort(aList);
            System.out.println("a_time: " + (System.currentTimeMillis() - time2));
            System.out.println("--------------------------------------------------");
        }
    }
//        while (arrayList.remove("D")) ;

//        System.out.println(arrayList);
//        Collections.sort(arrayList);
//        System.out.println(arrayList);
//        System.out.println(arrayList);
//        arrayList.sort((o1, o2) -> o1.length() - o2.length());
//        System.out.println(arrayList);

}
