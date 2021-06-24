package ru.postlife.java3.generic;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruitList;

    public Box() {
        fruitList = new ArrayList<>();
    }

    public void add(T fruit) {
        fruitList.add(fruit);
    }

    public double getWeight() {
        if (fruitList.size() == 0) {
            return 0;
        }
        return fruitList.size() * fruitList.get(0).getWeight();
    }

    public boolean compare(Box<? extends Fruit> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.000001;
    }

    public void moveAll(Box<T> destBox) {
        for (T t : fruitList) {
            destBox.add(t);
        }
        fruitList.clear();
    }
}
