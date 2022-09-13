package ru.postlife.tasks;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata {

    public static void main(String[] args) {
        //System.out.println(Kata.filterList(List.of(1, 2, "a", "b")));
        //System.out.println(solution(10));
        System.out.println(isPrime(7));
    }

    public static int solution(int number) {
//        int sum = 0;
//        for (int i = 0; i < number; i++) {
//            if (i % 3 == 0 || i % 5 == 0)
//                sum+=i;
//        }
//        return sum;

        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();
    }

    public static boolean isPrime(int num) {
        if (num < 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(o -> o.getClass() != String.class).collect(Collectors.toList());
    }
}