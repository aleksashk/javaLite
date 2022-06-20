package com.gmail.aleksandrphilimonov.lesson4.homework.task3;

import com.gmail.aleksandrphilimonov.lesson4.homework.task3.fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> container;

    public void setContainer(ArrayList<T> container) {
        this.container = container;
    }

    public Box() {
        this.container = new ArrayList<>();
    }

    public Box(T... fruits) {
        this.container = new ArrayList<>(Arrays.asList(fruits));
    }

    public ArrayList<T> getContainer() {
        return container;
    }

    public float getWeight() {
        if (container.size() == 0) {
            return 0.0f;
        }
        return container.size() * container.get(0).getWeight();
    }

    public boolean compare(Box<? extends T> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.00001;
    }

    public void add(T fruit) {
        container.add(fruit);
    }

    public void add(T... fruits) {
        container.addAll(Arrays.asList(fruits));
    }

    public void moveToAnotherBox(Box<? super T> box) {
        if (this == box) {
            return;
        }
        box.container.addAll(this.container);
        this.container.clear();
    }
}