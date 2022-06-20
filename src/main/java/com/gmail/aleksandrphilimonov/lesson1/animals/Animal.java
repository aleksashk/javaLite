package com.gmail.aleksandrphilimonov.lesson1.animals;

public abstract class Animal {
    String name;
    String color;
    int age;

    public Animal() {
    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public abstract void voice();
}
