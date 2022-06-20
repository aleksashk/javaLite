package com.gmail.aleksandrphilimonov.lesson1.homeworkV2_0.animals;

public class Dog extends Animal {
    public static int count;

    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        super("Dog", name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
