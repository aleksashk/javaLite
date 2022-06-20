package com.gmail.aleksandrphilimonov.lesson2.homework;

public class Robot implements Action {
    int maxDistance;
    int maxHeight;

    public Robot() {
        maxDistance = 10000;
        maxHeight = 2;
    }

    @Override
    public void run(Road road) {
        if (road.length > maxDistance) {
            System.out.println("" + getClass().getSimpleName() + " не справился с дистанцией " + road.length + " м.");
            return;
        }
        System.out.println("" + getClass().getSimpleName() + " справился с дистанцией " + road.length + " м.");
    }

    @Override
    public void jump(Wall wall) {
        if (wall.height > maxHeight) {
            System.out.println("" + getClass().getSimpleName() + " не справился с высотой " + wall.height + " м.");
            return;
        }
        System.out.println("" + getClass().getSimpleName() + " справился с высотой " + wall.height + " м.");
    }
}
