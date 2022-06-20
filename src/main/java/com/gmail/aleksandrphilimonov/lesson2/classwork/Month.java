package com.gmail.aleksandrphilimonov.lesson2.classwork;

public enum Month {
    JANUARY(1, "Январь"),
    FEBRUARY(2,"Февраль"),
    MARCH(3,"Маре"),
    APRIL(4,"Апрель"),
    MAY(5,"Май"),
    JUNE(6,"Июнь"),
    JULY(7,"Июль"),
    AUGUST(8,"Август"),
    SEPTEMBER(9,"Сентябрь"),
    OCTOBER(10,"Октябрь"),
    NOVEMBER(11,"Ноябрь"),
    DECEMBER(12,"Декабрь");

    final int number;
    final String title;

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    Month(int number, String title){
        this.number = number;
        this.title = title;
    }
}
