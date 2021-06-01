package ru.postlife.java2.homework2;

public class MyArrayDataException extends NumberFormatException {

    public MyArrayDataException(String inString, int row, int col) {
        super(String.format("Invalid data format in cell [%d][%d] : \"%s\"", row, col, inString));
    }
}