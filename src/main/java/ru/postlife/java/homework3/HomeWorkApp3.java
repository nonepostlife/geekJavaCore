package ru.postlife.java.homework3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWorkApp3 {

    public static void main(String[] args) {

        System.out.println("#1");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0)
                array[i] = 1;
            else if (array[i] == 1)
                array[i] = 0;
        }
        System.out.println(Arrays.toString(array));

        System.out.println("#2");
        int length = 100;
        int[] array2 = new int[length];
        for (int i = 0; i < length; i++)
            array2[i] = i + 1;
        System.out.println(Arrays.toString(array2));

        // 3
        System.out.println("#3");
        int[] array3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if(array3[i] < 6)
                array3[i] *= 2;
        }
        System.out.println(Arrays.toString(array3));

        // 4
        System.out.println("#4");
        int length2 = 7;
        int[][] array4 = new int[length2][length2];
        for (int i = 0; i < length2; i++) {
            array4[i][i] = 1;
            array4[i][length2 - i - 1] = 1;
        }
        for (int i = 0; i < length2; i++) {
            for (int j = 0; j < length2; j++) {
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }

        // 5
        System.out.println("#5");
        int[] array5 = createArray(7, -1);
        System.out.println(Arrays.toString(array5));

        // 6
        System.out.println("#6");
        int[] array6 = { 1, 5, 3, -2, 11, 4, -5, 2, 4, 8, 9, -1};
        int max = findMaxElemInArray(array6);
        int min = findMinElemInArray(array6);
        System.out.println(Arrays.toString(array6));
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);

        // 7
        int[] array71 = {2,2,1,2};
        int[] array72 = {2,3,2,2,1};
        System.out.println("#7");
        System.out.println("Исходный массив: " + Arrays.toString(array71));
        System.out.println("Наличие точки баланса: " + checkBalance(array71));
        System.out.println("Исходный массив: " + Arrays.toString(array72));
        System.out.println("Наличие точки баланса: " + checkBalance(array72));

        // 8
        System.out.println("#8");
        int offset = 4;
        int[] array8 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Исходный массив: " + Arrays.toString(array8));
        shiftArray(array8, offset);
        System.out.println("Массив после сдвига на " + offset + " позиции(-й): " + Arrays.toString(array8));
    }

    private static void shiftArray(int[] array, int offset){
        int temp = 0;
        if(offset < 0) {
            offset *= -1;
            for (int i = 0; i < offset % array.length; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        } else {
            for (int i = 0; i < offset % array.length; i++) {
                for (int j = array.length - 1; j > 0; j--) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }


    private static boolean checkBalance(int[] array){
        if(array.length == 0)
            return false;

        for (int i = 0; i < array.length; i++) {
            int sumPrevPosition = 0;
            int sumNextPosition = 0;
            for (int j = 0; j < i; j++) {
                sumPrevPosition += array[j];
            }
            for (int j = i; j < array.length; j++) {
                sumNextPosition += array[j];
            }
            if(sumPrevPosition == sumNextPosition)
                return true;
        }
        return false;
    }

    private static int findMaxElemInArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }

    private static int findMinElemInArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];
        }
        return min;
    }

    private static int[] createArray(int length, int initialValue){
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
