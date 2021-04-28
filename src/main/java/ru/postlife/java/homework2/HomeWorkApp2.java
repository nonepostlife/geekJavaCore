package ru.postlife.java.homework2;

import java.util.ArrayList;
import java.util.List;

public class HomeWorkApp2 {

    public static void main(String[] args) {

        // 1
        int a = -3;
        int b = 13;
        if(checkSumInRange(a, b))
            System.out.println("Сумма " + a + " и " + b + " находится в пределах от 10 от 20");

        //2
        checkSign(1);
        checkSign(-5);
        checkSign(0);

        //3
        if(isNegative(a))
            System.out.println(a + " отрицательное число");
        if(isNegative(-a))
            System.out.println(a + " отрицательное число");

        //4
        String string = "Print me!";
        printWords(string, 2);
        printWords(string, -2);
        printWords(string, 1);

        //5
        List<Integer> list = new ArrayList<Integer>();
        list.add(800);
        list.add(2100);
        list.add(1900);
        list.add(1812);
        list.add(2020);
        list.add(1917);

        for (int i: list) {
            if(isLeapYear(i))
                System.out.println(i + " год является високосным");
            else
                System.out.println(i + " год не является високосным");
        }
    }

    static private boolean checkSumInRange(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static private void checkSign(int a){
        if(a >= 0)
            System.out.println(a + " является положительным числом");
        else
            System.out.println(a + " является отрицательным числом");
    }

    static private boolean isNegative(int a){
        return a < 0;
    }

    static private void printWords(String string, int count){
        if(count <= 0)
            return;
        for (int i = 0; i < count; i++)
            System.out.println(string);
    }

    static private boolean isLeapYear(int a) {
        if(a%400 == 0 || a%4 == 0 && a%100 != 0)
            return true;
        else
            return false;
    }
}
