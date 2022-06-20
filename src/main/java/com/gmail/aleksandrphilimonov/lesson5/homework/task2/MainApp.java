package com.gmail.aleksandrphilimonov.lesson5.homework.task2;

import java.util.HashSet;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.add("A", "123-456-789");
        pb.add("A", "000-456-789");
        pb.add("A", "789-456-789");
        pb.add("AB", "123-456-789");
        pb.add("AC", "000-456-789");
        pb.add("AC", "040-456-789");
        pb.add("AC", "000-456-789");
        pb.add("AB", "789-456-789");
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, HashSet<String>> e : pb.storage.entrySet()) {
            sb.append(e.getKey()).append("\t->\t").append(e.getValue()).append("\n");
        }
        System.out.println(sb);

        System.out.println(pb.getPhoneByName("A"));
        System.out.println(pb.getAllName());
    }
}
