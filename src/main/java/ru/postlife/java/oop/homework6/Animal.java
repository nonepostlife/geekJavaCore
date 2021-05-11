package ru.postlife.java.oop.homework6;

public abstract class Animal {
    private static int animalCount;
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        animalCount++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int getCount() {
        return animalCount;
    }
}
