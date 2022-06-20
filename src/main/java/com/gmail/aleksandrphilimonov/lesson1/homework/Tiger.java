package com.gmail.aleksandrphilimonov.lesson1.homework;

public class Tiger extends Animal {

    private static int tigerCount;
    private String name;

    public Tiger(String name) {
        super();
        this.name = name;
        tigerCount++;
    }

    public int getTigerCount() {
        return tigerCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void swim(int distance) {
        int swimMax = 100;
        if (distance > swimMax) {
            System.out.println("Tiger " + name + " can't swim distance: " + distance + " m.");
        } else {
            System.out.println("Dog swim distance: " + distance + " m.");
        }
    }

    @Override
    public void run(int distance) {
        int runMax = 700;
        if (distance > runMax) {
            System.out.println("tiger can't run distance: " + distance + " m.");
        } else {
            System.out.println("tiger run distance: " + distance + " m.");
        }
    }

    @Override
    public void showCount() {
        System.out.println("count of dogs " + tigerCount + " total animals count " + count);
    }
}
