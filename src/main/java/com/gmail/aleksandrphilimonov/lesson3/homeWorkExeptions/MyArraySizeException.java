package com.gmail.aleksandrphilimonov.homeWorkExeptions;

public class MyArraySizeException extends MyException{
    public MyArraySizeException() {
        super("There is an incorrect measurement in the matrix");
    }
}
