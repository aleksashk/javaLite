package com.gmail.aleksandrphilimonov.lesson1.homework;

public class Dog extends Animal {

    private static int dogCount;
    private String name;

    public Dog(String name) {
        super();
        this.name = name;
        dogCount++;
    }

    public int getDogCount() {
        return dogCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void swim(int distance) {
        int swimMax = 10;
        if (distance > swimMax) {
            System.out.println(name + " dog can't swim distance: " + distance + " m.");
        } else {
            System.out.println(name + " dog swim distance: " + distance + " m.");
        }
    }

    @Override
    public void run(int distance) {
        int runMax = 500;
        if (distance > runMax) {
            System.out.println(name + " dog can't run distance: " + distance + " m.");
        } else {
            System.out.println(name + " dog run distance: " + distance + " m.");
        }
    }

    @Override
    public void showCount() {
        System.out.println("count of dogs " + dogCount + " total animals count " + count);
    }
}
