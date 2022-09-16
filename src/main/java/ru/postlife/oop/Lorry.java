package ru.postlife.oop;

public class Lorry extends Car {

    public Lorry(Engine engine, String color, String name) {
        super(engine, color, name);
    }

    @Override
    public void move() {
        this.getEngine().start();
        System.out.println("Машина " + getName() + " в движении...");
    }

    @Override
    public void stop() {
        System.out.println("Машина " + getName() + " остановилась...");
        this.getEngine().stop();
    }
}
