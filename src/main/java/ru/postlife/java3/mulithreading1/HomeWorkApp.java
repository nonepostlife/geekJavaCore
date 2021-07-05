package ru.postlife.java3.mulithreading1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HomeWorkApp {

    private static final Object mon = new Object();
    private static volatile char currentChar = 'A';

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(HomeWorkApp::printA);
        executorService.submit(HomeWorkApp::printB);
        executorService.submit(HomeWorkApp::printC);

        executorService.shutdown();
    }

    public static void printA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentChar != 'A') {
                        mon.wait();
                    }
                    System.out.print("A");
                    currentChar = 'B';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentChar != 'B') {
                        mon.wait();
                    }
                    System.out.print("B");
                    currentChar = 'C';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printC() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentChar != 'C') {
                        mon.wait();
                    }
                    System.out.print("C");
                    currentChar = 'A';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
