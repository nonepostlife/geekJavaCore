package ru.postlife.java2.multithreading;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) throws InterruptedException {
        doWithoutThreads();
        doWithThreads();
    }

    public static void doWithoutThreads() {
        final int size = 10_000_000;
        final int h = size / 2;
        float[] arr = new float[size];

        Arrays.fill(arr, 1.0f);

        long start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        long finish = System.currentTimeMillis();
        System.out.printf("1 метод отрбаотал задачу за %d\n", finish - start);
        //System.out.println(Arrays.toString(arr));
    }

    public static void doWithThreads() throws InterruptedException {
        final int size = 10_000_000;
        final int h = size / 2;
        float[] arr = new float[size];
        float[] arrayLeft = new float[h];
        float[] arrayRight = new float[h];
        float[] resultArray =  new float[size];

        Arrays.fill(arr, 1.0f);

        long start = System.currentTimeMillis();

        System.arraycopy(arr, 0, arrayLeft, 0, h);
        System.arraycopy(arr, h, arrayRight, 0, h);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < h; i++) {
                arrayLeft[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = h; i < size; i++) {
                arrayRight[i - h] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.arraycopy(arrayLeft, 0, resultArray, 0, h);
        System.arraycopy(arrayRight, 0, resultArray, h, h);

        long finish = System.currentTimeMillis();

        System.out.printf("2 метод отрбаотал задачу за %d\n", finish - start);
        //System.out.println(Arrays.toString(resultArray));
    }
}
