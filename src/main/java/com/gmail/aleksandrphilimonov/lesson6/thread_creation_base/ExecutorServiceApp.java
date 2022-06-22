package com.gmail.aleksandrphilimonov.lesson6.thread_creation_base;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceApp {
    public static void main(String[] args) {
//        ExecutorService service = Executors.newFixedThreadPool(2);
//        for (int i = 0; i < 10; i++) {
//            final int w = i + 1;
//            service.execute(() -> {
//                System.out.println(w + " " + Thread.currentThread().getName() + " - Begin ");
//                try {
//                    Thread.sleep(100 + (int) (3000 * Math.random()));
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println(w + " " + Thread.currentThread().getName() + " - End");
//            });
//        }
//        service.shutdown();

        ExecutorService service = Executors.newFixedThreadPool(4);
        Future<String> stringFeature = service.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000);
                return "Java";
            }
        });
        try {
            String result = stringFeature.get();
            System.out.println(result);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }
}
