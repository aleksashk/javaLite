package com.gmail.aleksandrphilimonov.lesson9.reflection_api;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, MalformedURLException {
//        Class stringClass1 = "Java".getClass();
//        Class stringClass2 = String.class;
//        Class stringClass = Class.forName("java.lang.String");
//
//        Class classCat = Cat1.class;
//        System.out.println(classCat.getSimpleName());
//        System.out.println(classCat.getName());
//        classCat.getDeclaredMethod("publicMeow").invoke(classCat.getConstructor().newInstance());
//        Method[] methods = classCat.getDeclaredMethods();
//        System.out.println("----------------------------------");
//        for (Method m : methods) {
//            System.out.println(m.getName());
//        }
//
//        System.out.println("----------------------------------");
//        Cat1 cat1 = new Cat1(1, 2, 3);
//        methods[1].invoke(cat);

//        System.out.println("----------------------------------");
//        methods[0].invoke(cat);
//        System.out.println("----------------------------------");
//        methods[1].invoke(cat);
//        System.out.println("----------------------------------");
//        methods[2].invoke(cat);
//            methods[0].setAccessible(true);
//        methods[0].invoke(cat);
//        methods[1].invoke(cat);
//        Cat1.class.getDeclaredMethod("getCatString").invoke(cat1);
//        int mods = methods[0].getModifiers();
//        System.out.println("isStatic = " + Modifier.isStatic(mods));
//        System.out.println("isFinal = " + Modifier.isFinal(mods));
//        System.out.println("isPublic = " + Modifier.isPublic(mods));
//
//        System.out.println("------------------------------");
//        Field[] fields = classCat.getDeclaredFields();
//        for (Field f : fields) {
//            System.out.println(f);
//        }
//        System.out.println(("" + fields[2]).split("\\s")[1] + " " + fields[2].getName() + " = " + fields[2].get(cat1));
//        methods[0].invoke(null);
//        int mod = methods[0].getModifiers();
//        System.out.println("isStatic " + Modifier.isStatic(mod));
//        System.out.println("isPublic " + Modifier.isPublic(mod));
//        System.out.println("isPrivate " + Modifier.isPrivate(mod));
//        fields[1].setInt(cat1, 256);
//        System.out.println(fields[1].get(cat1));
//        Cat1 cat12 = (Cat1) classCat.newInstance();
//        System.out.println(cat12);
//        Cat1 cat123 = (Cat1)classCat.getConstructor(int.class, int.class, int.class).newInstance(5,6,7);
//        System.out.println(cat123);
        ClassLoader cl = new URLClassLoader(new URL[]{new File("C:/javaReflection").toURL()});
        Class humanClass = cl.loadClass("com.gmail.aleksandrphilimonov.lesson2.homework.Human");
//        System.out.println(humanClass.newInstance());
//        Object humanObj = humanClass.getConstructor(String.class, int.class).newInstance("Bob123", 33);
//        Method greetingMeth = humanClass.getDeclaredMethod("greetings");
//        greetingMeth.invoke(humanObj);

        TestMethod tm = new TestMethod();
        List<Method> executionList = Arrays.stream(TestMethod.class.getDeclaredMethods())
                .filter(m -> m.isAnnotationPresent(MyAnnotation.class))
                .sorted((o1, o2) -> o2.getAnnotation(MyAnnotation.class).priority() - o1.getAnnotation(MyAnnotation.class).priority())
                .collect(Collectors.toList());
        for (Method m : executionList) {
            m.invoke(null);
        }


    }
}
























