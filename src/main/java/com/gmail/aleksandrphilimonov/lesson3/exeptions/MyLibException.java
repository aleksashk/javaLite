package com.gmail.aleksandrphilimonov.lesson3.exeptions;

public class MyLibException extends RuntimeException {
    public MyLibException() {
    }

    public MyLibException(String message) {
        super(message);
    }
}
