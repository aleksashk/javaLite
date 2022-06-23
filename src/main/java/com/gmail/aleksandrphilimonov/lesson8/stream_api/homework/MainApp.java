package com.gmail.aleksandrphilimonov.lesson8.stream_api.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp {
    static class Person {
        private String name;
        private int age;
        private double salary;

        public Person(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        String result = Stream.of("A", "AA", "ACA", "AV", "ACA", "AV", "AA", "A", "A", "A", "A", "AA", "AA", "ACA", "ACA")
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(e -> e.getValue()))
                .get()
                .getKey();
        System.out.println(result);

        Person[] persons = {
                new Person("Bob1", 30, 54500),
                new Person("Bob2", 42, 40230),
                new Person("Bob3", 33, 50020),
                new Person("Bob4", 44, 42300),
                new Person("Bob5", 35, 53040),
                new Person("Bob6", 46, 44500),
                new Person("Bob7", 37, 55070),
                new Person("Bob8", 48, 46000)
        };
        System.out.println(Arrays.stream(persons).mapToDouble(Person::getSalary).average().getAsDouble());

        final int n = 2;
        System.out.println(Arrays.stream(persons)
                .sorted(((o1, o2) -> o2.age - o1.age))
                .limit(n)
                .map(Person::getName)
                .collect(Collectors.joining(" и ", n + " самых старших сотрудника зовут: ", ".")));
//        System.out.println(resultStr);

    }
}
