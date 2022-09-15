package ru.postlife.oop;

public class Engine implements IEngine {
    @Override
    public void start() {
        System.out.println("Двигатель заведен!");
    }

    @Override
    public void stop() {
        System.out.println("Двигатель заглушен!");
    }
}
