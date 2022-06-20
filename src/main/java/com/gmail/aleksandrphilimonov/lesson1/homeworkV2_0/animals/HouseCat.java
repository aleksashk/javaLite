package com.gmail.aleksandrphilimonov.lesson1.homeworkV2_0.animals;

public class HouseCat extends Cat {
    public static int count;

    public HouseCat(String name, int maxRunDistance) {
        super("House cat", name, maxRunDistance, 0);
        count++;
    }
}
