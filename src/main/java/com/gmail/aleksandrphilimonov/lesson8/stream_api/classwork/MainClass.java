package com.gmail.aleksandrphilimonov.lesson8.stream_api.classwork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainClass {
    static class Person {
        enum Position {
            ENGINEER, DIRECTOR, MANAGER;
        }

        private String name;
        private int age;
        private Position position;

        public Person(String name, int age, Position position) {
            this.name = name;
            this.age = age;
            this.position = position;
        }
    }

    public static void main(String[] args) {

        List<String> list = Stream.of("Java", "John")
                .map(sList -> sList.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list);

        try {
            Files.lines(Paths.get("text.txt"))
                    .map(line -> line.split("\\s"))
                    .distinct()
                    .forEach(arr -> System.out.println(Arrays.toString(arr)));
            System.out.println("--------------------------------------------");
            System.out.println(Files.lines(Paths.get("text.txt"))
                    .map(line -> line.split("\\s"))
                    .flatMap(Arrays::stream)
                    .distinct()
                    .sorted()
                    .collect(Collectors.joining(", ", "Unique words: ", ".")));

            System.out.println("--------------------------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        firstEx();
//
//        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
//        List<String> sList = integers.stream()
//                .filter(n -> n > 5)
//                .map(n -> n * 2)
//                .map(String::valueOf)
//                .collect(Collectors.toList());
//
//        for (String s : sList) {
//            System.out.println(s.getClass().getSimpleName() + " -> " + s);
//        }
//
//        List<Integer> iList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
//        List<Integer> out = iList.stream()
//                .filter(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer integer) {
//                        return integer % 2 == 0;
//                    }
//                })
//                .collect(Collectors.toList());
//
//        List<Integer> out2 = iList.stream()
//                .filter(n -> n % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println(out);
//        System.out.println(out2);
//
//        integers.stream()
//                .filter(n -> n % 2 == 1)
//                .forEach(new Consumer<Integer>() {
//                    @Override
//                    public void accept(Integer integer) {
//                        System.out.println(integer);
//                    }
//                });
//
//        integers.stream()
//                .filter(n -> n % 2 == 1)
//                .forEach(System.out::println);
//
//        System.out.println("--------------------------------------");
//        Stream.of("AA", "BBB", "C", "DDDD")
//                .map(String::length).forEach(System.out::println);
//        System.out.println("--------------------------------------");
//        Stream.of(1, 2, 3, 4, 5, 6)
//                .map(i -> i * 241).forEach(System.out::println);
//        secondEx();
//        thirdEx();
//        matchEx();
//        findAnyEx();
//        mappingEx();
//        reduceEx();
//        intStreamEx();
//        streamFromFilesEx();
        simpleStringEx();
    }

    private static void firstEx() {
        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Bob1", 35, Person.Position.MANAGER),
                new Person("Bob2", 15, Person.Position.ENGINEER),
                new Person("Bob3", 7, Person.Position.DIRECTOR),
                new Person("Bob4", 60, Person.Position.MANAGER),
                new Person("Bob5", 20, Person.Position.ENGINEER),
                new Person("Bob6", 70, Person.Position.MANAGER),
                new Person("Bob7", 18, Person.Position.ENGINEER),
                new Person("Bob8", 12, Person.Position.DIRECTOR)
        ));

        List<Person> engineers = new ArrayList<>();
        for (Person o : persons) {
            if (o.position == Person.Position.ENGINEER) {
                engineers.add(o);
            }
        }

        engineers.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

        List<String> engineersName = new ArrayList<>();
        for (Person o : engineers) {
            engineersName.add(o.name);
        }
        System.out.println(engineersName);

        List<String> engineersNamesShortPath = persons.stream()
                .filter(person -> person.position == Person.Position.ENGINEER)
                .sorted((o1, o2) -> o1.age - o2.age)
                .map((Function<Person, String>) person -> person.name)
                .collect(Collectors.toList());
        System.out.println(engineersNamesShortPath);
    }

    public static void secondEx() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> out = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(out);
    }

    public static void thirdEx() {
        Stream.of(1, 2, 3, 4, 4, 3, 3, 1, 2, 4, 2, 1)
                .distinct()
                .forEach(System.out::println);
    }

    public static void matchEx() {

        System.out.println(Stream.of(1, 2, 3, 4, 5)
                .allMatch(n -> n < 10));
        System.out.println(Stream.of(1, 2, 3, 4, 5)
                .noneMatch(n -> n == 4));
        System.out.println(Stream.of(1, 2, 3, 4, 5)
                .anyMatch(n -> n == 2));

    }

    public static void findAnyEx() {
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .filter(n -> n > 10).findAny());

        for (int i = 0; i < 1000000; i++) {
            Optional<Integer> opt = Stream.of(1, 2, 3, 4, 5, -6, 7, 10, -5, 32, 10000000, 80).filter(n -> n > 5).findAny();
            if (opt.isPresent()) {
                int num = opt.get();
                System.out.println("i = " + i + " -> " + num);
                if (num != 7) {
                    System.out.println("!!!!!!!!!!!!!!!!");
                    break;
                }
                System.out.println("----------------------------------");

            }
        }
    }

    public static void mappingEx() {
        Function<String, Integer> _strToLen = String::length;
        Function<String, Integer> strToLen = s -> s.length();
        Predicate<Integer> evenNumberFilter = n -> n % 2 == 0;
        Function<Integer, Integer> cube = n -> n * n * n;

        List<Integer> list = Stream.of("FF", "GGG", "T", "JJJJJ").map(_strToLen).collect(Collectors.toList());
        System.out.println(list);

    }

    public static void reduceEx() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }

        int streamSum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println("sum " + sum + " = " + streamSum);

    }

    public static void intStreamEx() {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 90);
        System.out.println(list.stream().mapToInt(v -> v).sum());
        IntStream.rangeClosed(2, 10).filter(n -> n % 2 == 0).forEach(System.out::println);

    }

    public static void streamFromFilesEx() {
        try {
            Files.lines(Paths.get("123.txt")).map(String::length).forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void simpleStringEx() {
        System.out.println(Arrays.stream("A DD WW EEEEE  TTT HHH F SS A".split("\\s")).distinct().count());

    }
}
