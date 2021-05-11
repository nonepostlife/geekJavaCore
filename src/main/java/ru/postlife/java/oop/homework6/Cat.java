package ru.postlife.java.oop.homework6;

public class Cat extends Animal {
    private static int catCount;

    public Cat(String name, int age) {
        super(name, age);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance < 200 && distance > 0) {
            System.out.println(name + " пробежал " + distance + "м.");
        } else {
            System.out.println("Коты могут пробежать от 1 до 200 метров");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Котики не плавают :З");
    }


    public static int getCount() {
        return catCount;
    }
}
