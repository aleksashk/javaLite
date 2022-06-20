package com.gmail.aleksandrphilimonov.lesson2.homework;

public class MainApp {
    public static void main(String[] args) {
        Human human = new Human();
        Robot robot = new Robot();
        Cat cat = new Cat();
        Action[] participants = {
                human,
                robot,
                cat
        };
        Road road1 = new Road(1500);
        Road road2 = new Road(400);
        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(2);
        for (Action item : participants) {
            item.jump(wall1);
            item.jump(wall2);
            item.run(road1);
            item.run(road2);
        }
    }
}
