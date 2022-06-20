package com.gmail.aleksandrphilimonov.exeptions;

public class MyLibException extends RuntimeException {
    public MyLibException() {
    }

    public MyLibException(String message) {
        super(message);
    }
}
