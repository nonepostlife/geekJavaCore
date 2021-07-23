package ru.postlife.java3.testing;

public class ArrayZeroSizeException extends RuntimeException{

    public ArrayZeroSizeException() {
        super("Invalid size of array :expected not zero size");
    }
}