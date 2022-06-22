package com.gmail.aleksandrphilimonov.lesson3.homeWorkExeptions;

public class MainApp {
    public static void main(String[] args) {
        String[][] sArray1 = {{"1", "2", "3", "4"}, {"11", "21", "31", "41"}, {"111", "211", "311", "1111"}, {"100000", "21111", "31111", "411111"}};
        String[][] sArray2 = {{"1", "2i", "3", "4"}, {"11", "21", "31", "41"}, {"111", "211", "311", "1111"}, {"100000", "21111", "31111", "411111"}};
        try {
            int res = calculate(sArray1);
            System.out.println(res);
            res = calculate(sArray2);
            System.out.println(res);
        } catch (MyException e) {
            System.out.println("ignored");
        }
    }

    public static int calculate(String[][] sArray) {
        if (sArray.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < 4; i++) {
            if (sArray[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        int result = 0;
        for (int i = 0; i < sArray.length; i++) {
            for (int j = 0; j < sArray[i].length; j++) {
                try {
                    result += Integer.parseInt(sArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
            }
        }
        return result;
    }
}
