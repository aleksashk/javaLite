package com.gmail.aleksandrphilimonov.lesson6.race_condition;

public class Counter {
    int counter;

    public int value() {
        return counter;
    }

    public Counter() {
        counter = 0;
    }

    public void inc() {
        counter++;
    }

    public void dec() {
        counter--;
    }
}
