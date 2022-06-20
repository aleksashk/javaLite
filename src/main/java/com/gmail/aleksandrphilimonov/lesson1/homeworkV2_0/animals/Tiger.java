package com.gmail.aleksandrphilimonov.lesson1.homeworkV2_0.animals;

public class Tiger extends Cat {
    public static int count;

    public Tiger(String name, int maxRunDistance, int maxSwimDistance) {
        super("Tiger", name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
