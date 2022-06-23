package com.gmail.aleksandrphilimonov.lesson6_7.race_condition;

public class SynchCounter {
    int counter;

    public int value() {
        return counter;
    }

    public SynchCounter() {
        counter = 0;
    }

    public synchronized void inc() {
        counter++;
    }

    public synchronized void dec() {
        counter--;
    }
}
