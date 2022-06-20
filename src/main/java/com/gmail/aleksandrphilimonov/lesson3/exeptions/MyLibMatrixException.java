package com.gmail.aleksandrphilimonov.exeptions;

public class MyLibMatrixException extends MyLibException {
    private int row;
    private int column;
    private int value;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Object getValue() {
        return value;
    }

    public MyLibMatrixException(int row, int column, int[][] array) {
        super("Invalid date in [" + column + "; " + row + "]: " + array[column][row]);
        this.row = row;
        this.column = column;
        this.value = array[column][row];
    }
}
