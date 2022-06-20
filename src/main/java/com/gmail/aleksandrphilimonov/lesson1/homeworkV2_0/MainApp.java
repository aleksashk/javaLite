package com.gmail.aleksandrphilimonov.lesson1.homeworkV2_0;

import com.gmail.aleksandrphilimonov.lesson1.homeworkV2_0.animals.*;

public class MainApp {
    public static void main(String[] args) {
        Animal[] animals = {
                new HouseCat("Barsik", 200),
                new Dog("Bobik", 1000, 50),
                new Tiger("Tigra", 1000, 500)
        };
        for (Animal a : animals) {
            a.run(800);
            a.swim(40);
        }
        System.out.println("Animals count: " + Animal.count);
        System.out.println("Cats count: " + Cat.count);
        System.out.println("House Cats count: " + HouseCat.count);
        System.out.println("Dogs count: " + Dog.count);
        System.out.println("Tigers count: " + Tiger.count);
    }
}
