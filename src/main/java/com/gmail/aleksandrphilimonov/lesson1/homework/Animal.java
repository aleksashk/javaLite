package com.gmail.aleksandrphilimonov.lesson1.homework;

public abstract class Animal {
    public static int count;
    public String name;

    public abstract void swim(int distance);

    public abstract void run(int distance);

    public abstract void showCount();

    public Animal() {
        count++;
    }

    public Animal(String name) {
        this.name = name;
    }
}
