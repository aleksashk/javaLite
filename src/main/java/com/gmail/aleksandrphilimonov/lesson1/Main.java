package com.gmail.aleksandrphilimonov.lesson1;

import com.gmail.aleksandrphilimonov.lesson1.animals.Animal;
import com.gmail.aleksandrphilimonov.lesson1.animals.Cat;
import com.gmail.aleksandrphilimonov.lesson1.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Light", "Red", 4);
        cat.info();
        Dog dog = new Dog("Sharik", "White", 4);
        dog.voice();
        Cat cat2 = new Cat("Vasa", "Black", 1);
        cat2.info();
        cat.voice();
        cat2.voice();

        Animal[] animals ={
        new Cat("Vasa", "Red" , 2),
        new Dog("Sharick", "Green" , 1)};

        for (Animal item : animals) {
            item.info();
        }
    }
}