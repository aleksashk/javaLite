package com.gmail.aleksandrphilimonov.lesson5.homework.task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    
    HashMap<String, HashSet<String>> storage;

    public PhoneBook() {
        storage = new HashMap<>();
    }

    public void add(String name, String phone){
        if(!storage.containsKey(name)){
            storage.put(name, new HashSet<>());
        }
        storage.get(name).add(phone);
    }

    public Set<String> getPhoneByName(String name){
        return storage.get(name);
    }

    public Set<String> getAllName(){
        return storage.keySet();
    }
}
