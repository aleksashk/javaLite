package com.gmail.aleksandrphilimonov.lesson4.homework.task3;

import com.gmail.aleksandrphilimonov.lesson4.homework.task3.fruits.Apple;
import com.gmail.aleksandrphilimonov.lesson4.homework.task3.fruits.Fruit;
import com.gmail.aleksandrphilimonov.lesson4.homework.task3.fruits.Orange;

public class MainApp {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new Apple());
        Box<Apple> anotherAppleBox = new Box<>(new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange());
        Box<Fruit> fruitBox = new Box<>();

        appleBox.moveToAnotherBox(fruitBox);
        appleBox.moveToAnotherBox(anotherAppleBox);
//        appleBox.moveToAnotherBox(orangeBox);
//        fruitBox.moveToAnotherBox(appleBox);
    }
}
