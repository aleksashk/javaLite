package com.gmail.aleksandrphilimonov.lesson1.homeworkV2_0.animals;

public class Cat extends Animal {
    public static int count;

    public Cat(String type, String name, int maxRunDistance, int maxSwimDistance) {
        super(type, name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
