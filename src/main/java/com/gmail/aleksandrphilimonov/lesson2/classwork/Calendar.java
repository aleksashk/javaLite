package com.gmail.aleksandrphilimonov.lesson2.classwork;

public class Calendar {
    Month month = Month.FEBRUARY;
    public void currentDateInfo() {
        System.out.println(month.getNumber() + " " + month.getTitle());
    }
}
