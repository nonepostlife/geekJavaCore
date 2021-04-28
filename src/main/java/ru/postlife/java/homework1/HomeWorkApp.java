package ru.postlife.java.homework1;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static private void printThreeWords() {
        System.out.println("_Orange\n_Banana\n_Apple");
    }

    static private void checkSumSign() {
        int a = 5;
        int b = -18;
        String answer = (a + b) > 0 ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(answer);
    }

    static private void printColor() {
        int value = 123;
        if(value <= 0)
            System.out.println("Красный");
        else if (value <= 100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }

    static private void compareNumbers() {
        int a = 5;
        int b = 18;
        String answer = (a >= b) ? "a >= b" : "a < b";
        System.out.println(answer);
    }
}