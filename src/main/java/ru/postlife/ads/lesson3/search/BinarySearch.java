package ru.postlife.ads.lesson3.search;

public class BinarySearch {
    public static int search(Integer[] arr, int num) {

        int start = 0;
        int end = arr.length - 1;
        int base;
        int i = 0;

        while (end >= start) {

            i++;
            base = (start + end) / 2;

            if (arr[base] == num) {
                System.out.println("Кол-во итераций: " + i);
                return base;
            } else if (arr[base] > num) {
                end = base - 1;
            } else {
                start = base + 1;
            }
        }
        System.out.println("Кол-во итераций: " + i);
        return -1;
    }

    public static int searchRec(Integer[] arr, int num) {
        return searchRec(arr, num, 0, arr.length);
    }

    private static int searchRec(Integer[] arr, Integer num, int left, int right) {
        if (right < left) {
            return -1;
        }

        int base = (left + right) / 2;
        if (arr[base].equals(num)) {
            return base;
        } else if(num.compareTo(arr[base]) > 0) {
            return searchRec(arr, num, base + 1, right);
        } else  {
            return searchRec(arr, num, left, base - 1);
        }

    }
}
