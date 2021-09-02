package ru.postlife.ads.lesson5;

public class Countdown {
    public static void main(String[] args) {
        countdown(5);
    }

    private static void countdown(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        countdown(--n);
        System.out.println("End n = " + n);
    }


    private static void countDownCyclic(int n) {
        while (true) {
            if (n <= 0) {
                return;
            }

            System.out.println(--n);
        }
    }
}
