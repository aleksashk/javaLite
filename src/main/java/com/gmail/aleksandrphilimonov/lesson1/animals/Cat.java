package com.gmail.aleksandrphilimonov.lesson1.animals;

public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println(name + " mew-mew");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
