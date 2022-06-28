package com.gmail.aleksandrphilimonov.lesson9.reflection_api;

public class Cat {
    private int privateField;
    int defaultField;
    public int publicField;

    public Cat(int privateField, int defaultField, int publicField) {
        this.privateField = privateField;
        this.defaultField = defaultField;
        this.publicField = publicField;
    }

    public Cat() {
    }

    public void publicMeow() {
        System.out.println("publicMeow");
    }

    private void privateMeow() {
        System.out.println("privateMeow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "privateField=" + privateField +
                ", defaultField=" + defaultField +
                ", publicField=" + publicField +
                '}';
    }
}
