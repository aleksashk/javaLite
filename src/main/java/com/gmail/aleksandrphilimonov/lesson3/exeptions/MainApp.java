package com.gmail.aleksandrphilimonov.lesson3.exeptions;

public class MainApp {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {1, 3, 5}, {4, 2, 1}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 3 || array[i][j] == 5) {
                    throw new MyLibMatrixException(i, j, array);
                }
            }
        }
    }
}