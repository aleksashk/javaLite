package com.gmail.aleksandrphilimonov.lesson1.homework;

public class MainApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("cat");
        Cat cat2 = new Cat("cat cat");
        Cat cat3 = new Cat("cat cat cat");

        Dog dog = new Dog("dog");
        Dog dog2 = new Dog("dog dog");
        Dog dog3 = new Dog("dog dog dog");

        Tiger tiger = new Tiger("tiger");
        Tiger tiger2 = new Tiger("tiger tiger");
        Tiger tiger3 = new Tiger("tiger tiger tiger");

        Animal[] animals = {cat1, cat2, cat3, dog, dog2, dog3, tiger, tiger2, tiger3};
        for (Animal animal : animals) {
            animal.run(25);
            animal.swim(250);
            animal.showCount();
        }
    }
}