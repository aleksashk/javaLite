package com.gmail.aleksandrphilimonov.lesson4.generics;

public class BoxWithNumbers<N extends Number> {
    private N[] array;

    public N[] getArray() {
        return array;
    }

    public void setArray(N[] array) {
        this.array = array;
    }

    public BoxWithNumbers(N... array) {
        this.array = array;
    }

    public double average() {
        double average = 0.0;
        for (N n : array) {
            average += n.doubleValue();
        }
        return average / array.length;
    }

    public boolean compareAverage(BoxWithNumbers<?> another) {
        return Math.abs(this.average() - another.average()) < 0.0001;
    }
}
