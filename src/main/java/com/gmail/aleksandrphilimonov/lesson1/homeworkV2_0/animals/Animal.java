package com.gmail.aleksandrphilimonov.lesson1.homeworkV2_0.animals;

public class Animal {
    public static int count = 0;
    String type;
    String name;

    int maxRunDistance;
    int maxSwimDistance;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(type + " " + name + " успешно справился с кроссом " + distance + "m.");
        } else {
            System.out.println(type + " " + name + " не смог справиться с кроссом " + distance + "m.");
        }
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " не умеет плавать.");
            return;
        }
        if (distance <= maxSwimDistance) {
            System.out.println(type + " " + name + " успешно справился с заплывом " + distance + "m.");
        } else {
            System.out.println(type + " " + name + " не смог справиться с заплывом " + distance + "m.");
        }
    }
}
