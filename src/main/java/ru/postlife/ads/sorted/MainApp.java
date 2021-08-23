package ru.postlife.ads.sorted;

import java.util.Arrays;
import java.util.Random;

public class MainApp {

    private static Long time;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int count = 500;
        Notebook[] notebooks = new Notebook[count];

        for (int i = 0; i < count; i++) {
            float rnd = (float) Math.random();
            notebooks[i] = new Notebook(generateBrand(rnd), generateRam(4, 20, 4), generatePrice(500, 2100, 100));
        }

        startTime();
        InsertionSort.sort(notebooks);
        endTime();

        printArray(notebooks);
    }

    public static void startTime() {
        time = System.currentTimeMillis();
    }

    public static void endTime() {
        time = System.currentTimeMillis() - time;
        System.out.println(time);
    }

    public static void printArray(Notebook[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static Brand generateBrand(float rnd) {
        if (rnd < 0.2) {
            return Brand.LENUVO;
        } else if (rnd < 0.4) {
            return Brand.ASOS;
        } else if (rnd < 0.6) {
            return Brand.MACNOTE;
        } else if (rnd < 0.8) {
            return Brand.ESER;
        } else {
            return Brand.XAMIOU;
        }
    }

    public static int generatePrice(int min, int max, int step) {
        return RANDOM.nextInt((max - min) / step) * step + min;
    }

    public static int generateRam(int min, int max, int step) {
        return RANDOM.nextInt((max - min) / step) * step + min;
    }
}
