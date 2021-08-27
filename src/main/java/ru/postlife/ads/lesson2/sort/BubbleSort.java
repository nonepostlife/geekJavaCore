package ru.postlife.ads.lesson2.sort;

import ru.postlife.ads.lesson2.Notebook;

public class BubbleSort {
    public static void sort(Notebook[] arr) {
        boolean isChange;
        int limit = arr.length;
        do {
            isChange = false;
            limit--;
            for (int i = 0; i < limit; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    Notebook temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isChange = true;
                }
            }
        } while (isChange);
    }
}
