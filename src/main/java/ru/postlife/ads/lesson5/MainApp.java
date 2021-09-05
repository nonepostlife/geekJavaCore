package ru.postlife.ads.lesson5;

import ru.postlife.ads.lesson5.products.*;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(pow(3, 3));

        Backpack backpack = new Backpack(9);
        List<Item> items = new ArrayList<>();
        items.add(new Item("Ноутбук",4, 1000));
        items.add(new Item("Гитара",3, 600));
        items.add(new Item("Наушники",2, 350));
        items.add(new Item("Микроволновая печь",6, 500));
        items.add(new Item("Ожерелье",1, 1200));
        items.add(new Item("Телевизор",8, 2000));
        items.add(new Item("Часы",1, 600));

        backpack.collectProduct(items);
        backpack.show();
    }

    public static int pow(int base, int exp) {
        if (exp == 1) {
            return base;
        }
        return base * pow(base, --exp);
    }
}
