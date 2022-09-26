package ru.postlife.threads;

public class PingPongApp {

    private static final Object mon = new Object();
    private static volatile String current = "Pong";

    public static void main(String[] args) {
        new Thread(PingPongApp::printPing).start();
        new Thread(PingPongApp::printPong).start();
    }

    public static void printPing() {
        synchronized (mon) {
            try {
                while (true) {
                    while (!current.equals("Pong")) {
                        mon.wait();
                    }
                    System.out.println("Ping");
                    Thread.sleep(500);
                    current = "Ping";
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printPong() {
        synchronized (mon) {
            try {
                while (true) {
                    while (!current.equals("Ping")) {
                        mon.wait();
                    }
                    System.out.println("Pong");
                    Thread.sleep(500);
                    current = "Pong";
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
