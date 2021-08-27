package ru.postlife.ads.sorted;

public class InsertionSort {
    public static void sort(Notebook[] arr){
        for (int i = 1; i < arr.length; i++) {
            Notebook value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(value) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = value;
        }
    }
}
