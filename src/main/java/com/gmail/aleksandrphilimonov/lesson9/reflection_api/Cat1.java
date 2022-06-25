package com.gmail.aleksandrphilimonov.lesson9.reflection_api;

public class Cat1 {
    private int privateField;
    int defaultField;
    public int publicField;

    public static void getCatString() {
        System.out.println(Cat1.class.getSimpleName() + " -> run static method");
    }

    public Cat1(int privateField, int defaultField, int publicField) {
        this.privateField = privateField;
        this.defaultField = defaultField;
        this.publicField = publicField;
    }

    public Cat1() {
    }

    public void publicMeow() {
        System.out.println("public meow");
    }

    private void privateMeow() {
        System.out.println("privateMeow");
    }

    @Override
    public String toString() {
        return "Cat1{" +
                "privateField=" + privateField +
                ", defaultField=" + defaultField +
                ", publicField=" + publicField +
                '}';
    }
}
