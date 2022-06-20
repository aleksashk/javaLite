package com.gmail.aleksandrphilimonov.lesson2.classwork;

public class Duck implements Flyable, Swimable {

    @Override
    public void fly() {
        System.out.println("The duck is fly");
    }

    @Override
    public void swim() {
        System.out.println("The duck is swim");
    }
}
