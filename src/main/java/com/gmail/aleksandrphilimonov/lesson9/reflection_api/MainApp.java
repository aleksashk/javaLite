package com.gmail.aleksandrphilimonov.lesson9.reflection_api;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException, MalformedURLException {
        System.out.println(MainApp.class.getSimpleName());
        System.out.println(String.class);
        System.out.println(int.class);
        System.out.println(int.class.getName());
        System.out.println(int[].class);
        System.out.println(int[][].class);
        System.out.println(int[][][][][][][][][][].class);

        Class stringClass1 = "Java".getClass();
        Class stringClass2 = String.class;
        Class stringClass3 = Class.forName("java.lang.String");

        Class catClass = Cat.class;

        Cat cat = new Cat(1, 2, 3);

        Method[] methods = catClass.getDeclaredMethods();
//        methods[1].setAccessible(true);
//        for (Method m : methods) {
//            m.invoke(cat);
//        }
        int mods = methods[0].getModifiers();
        System.out.println("Is public: " + Modifier.isPublic(mods));
        System.out.println("Is private: " + Modifier.isPrivate(mods));
        System.out.println("Is static: " + Modifier.isStatic(mods));
        System.out.println("Is final: " + Modifier.isFinal(mods));
        System.out.println("This method in the class: " + methods[0].getDeclaringClass().getSimpleName());
        System.out.println("------------------------------------------------");

        Field[] fields = cat.getClass().getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }
        fields[0].setAccessible(true);
        System.out.println(fields[0].get(cat));
        Cat cat2 = (Cat) catClass.newInstance();
        System.out.println(cat2);
        Cat cat3 = (Cat) catClass.getConstructor(int.class, int.class, int.class).newInstance(3, 4, 5);
        System.out.println(cat3);

//        ClassLoader classLoader = new URLClassLoader(new URL[]{new File("C:/javaReflection/Hum/Human.class").toURL()});
//        Class humanClass = classLoader.loadClass("Human");
//        ClassLoader classLoader = new URLClassLoader(new URL[]{new File("C:/javaReflection/Hum").toURL()});
//        Class humanClass = classLoader.loadClass("Human");
//        Arrays.stream(TestClass.class.getDeclaredMethods()).filter(m->m.isAnnotationPresent(MyAnnotation.class)).forEach(m-> {
//            try {
//                m.invoke(null);
//            } catch (IllegalAccessException | InvocationTargetException e) {
//                throw new RuntimeException(e);
//            }
//        });

//        Class testClass = TestClass.class;
//        Method[] meth = testClass.getDeclaredMethods();
//        for (Method m : meth) {
//            if (m.isAnnotationPresent(MyAnnotation.class)) {
//                m.invoke(null);
//            }
//        }
//
//        List<Method> executionList = new ArrayList<>();
//        Method[] ms = TestClass.class.getDeclaredMethods();
//        for (Method m : ms) {
//            if(m.isAnnotationPresent(MyAnnotation.class)){
//                executionList.add(m);
//            }
//        }
//        executionList = executionList.stream().sorted(((o1, o2) -> o2.getAnnotation(MyAnnotation.class).priority() - o1.getAnnotation(MyAnnotation.class).priority())).collect(Collectors.toList());
//
//        for (Method m : ms) {
//            m.invoke(null);
//        }

        List<Method> list = Arrays.stream(TestClass.class.getDeclaredMethods()).filter(method -> method.isAnnotationPresent(MyAnnotation.class)).sorted((o1, o2) -> o2.getAnnotation(MyAnnotation.class).priority() - o1.getAnnotation(MyAnnotation.class).priority()).collect(Collectors.toList());
        for (Method m : list) {
            m.invoke(null);
        }
    }
}
























