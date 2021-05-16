package ru.postlife.java.oop.homework7;

public class Plate {
    private int food;

    public boolean decreaseFood(int amount) {
        if (food - amount < 0) {
            return false;
        }
        food -= amount;
        return true;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.printf("Тарелка [ Food: %d ]\n", food);
    }

    public void addFood(int amount) {
        food += amount;
        System.out.println("В тарелку добавлено еды: " + amount);
    }
}
