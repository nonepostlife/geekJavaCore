package ru.postlife.java.oop.homework6;

public class Dog extends Animal {
    private static int dogCount;

    public Dog(String name, int age) {
        super(name, age);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance < 500 && distance > 0) {
            System.out.println(name + " пробежал " + distance + "м.");
        } else {
            System.out.println("Собаки могут пробежать от 1 до 500 метров");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance < 10) {
            System.out.println(name + " проплыл " + distance + "м.");
        } else {
            System.out.println("Собаки могут проплыть от 1 до 10 метров");
        }
    }

    public static int getCount() {
        return dogCount;
    }
}
