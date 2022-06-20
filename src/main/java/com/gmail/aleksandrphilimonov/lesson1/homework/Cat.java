package com.gmail.aleksandrphilimonov.lesson1.homework;

public class Cat extends Animal {

    private static int catCount;
    private String name;

    public Cat(String name) {
        super();
        this.name = name;
        catCount++;
    }

    public int getCatCount() {
        return catCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " Cat can't swim");
    }

    @Override
    public void run(int distance) {
        int runMax = 200;
        if (distance > runMax) {
            System.out.println(name + " Cat can't run distance: " + distance + " m.");
        } else {
            System.out.println(name + " Cat run distance: " + distance + " m.");
        }
    }

    @Override
    public void showCount() {
        System.out.println("count of dogs " + catCount + " total animals count " + count);
    }
}
