package ru.postlife.java2.homework2;

public class MyArraySizeException extends RuntimeException{

    public MyArraySizeException(int arrayLength) {
        super(String.format("Invalid size of matrix : length array is %d, expected 4", arrayLength));
    }

    public MyArraySizeException(int row, int arrayLength) {
        super(String.format("Invalid size of array: length array[%d] is %d, expected 4", row, arrayLength));
    }
}