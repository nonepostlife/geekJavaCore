package ru.postlife.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    Lock lock = new ReentrantLock();

    private int counter;

    public Counter() {
        counter = 0;
    }

    void increase() {
        lock.lock();
        try {
            System.out.printf("%s %d \n", Thread.currentThread().getName(), counter);
            counter++;
        } finally {
            lock.unlock();
        }
    }
}