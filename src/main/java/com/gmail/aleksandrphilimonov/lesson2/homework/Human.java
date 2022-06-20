package com.gmail.aleksandrphilimonov.lesson2.homework;

public class Human implements Action {
    int maxDistance;
    int maxHeight;

    public Human() {
        maxDistance = 5000;
        maxHeight = 1;
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
