package com.gmail.aleksandrphilimonov.lesson4.generics;

public class MainApp {
    public static void main(String[] args) {
//        SimpleBox intBox1 = new SimpleBox(10);
//        SimpleBox intBox2 = new SimpleBox(20);
//
//        intBox1.setObj("Java");
//
//        int sum = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
//
//        System.out.println(sum);

//        GenBox<String> strBox = new GenBox<>("Java");
//        GenBox<Integer> intBox1 = new GenBox<>(10);
//        GenBox<Integer> intBox2 = new GenBox<>(20);
//        intBox1.setObj(25);
//        int sum = intBox1.getObj() + intBox2.getObj();
//        System.out.println(sum);
        BoxWithNumbers<Double> boxWithDouble = new BoxWithNumbers<>(1.2, 3.2222, 5.784, -10.0225);

        BoxWithNumbers<Double> boxWithDouble2 = new BoxWithNumbers<>(1.2, 3.2222, 5.784, -10.022885);

        BoxWithNumbers<Double> boxWithDouble3 = new BoxWithNumbers<>(1.2, 3.2222, 5.784, -110.022885);

        BoxWithNumbers<Integer> boxWithInteger = new BoxWithNumbers<>(1, 2, 3, 2222, 5, 784, -100225);

        System.out.println(boxWithInteger.average());
        System.out.println(boxWithDouble3.average());

        System.out.println(boxWithInteger.compareAverage(boxWithDouble3));

        BoxWithNumbers<Number> box = new BoxWithNumbers(1);
        BoxWithNumbers<Integer> box1 = new BoxWithNumbers(1);

        doSmth1(box);
        doSmth1(box1);
        doSmth2(box);
//        doSmth2(box1);

        Box b1 = new Box(25);
        Box b2 = new Box(24);
        Box b3 = new Box(25);

        System.out.println(b1.compareTo(b2));
        System.out.println(b2.compareTo(b3));
        System.out.println(b1.compareTo(b3));
    }

    public static void doSmth1(BoxWithNumbers<? extends Number> box) {

    }

    public static void doSmth2(BoxWithNumbers<Number> box) {

    }
}