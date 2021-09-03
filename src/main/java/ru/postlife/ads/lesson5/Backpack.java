package ru.postlife.ads.lesson5;

import ru.postlife.ads.lesson5.products.Item;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private final int maxWeight;
    private int bestPrice;
    List<Item> bestItems;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
        bestPrice = 0;
    }

    public void collectProduct(List<Item> items) {
        bestItems = new ArrayList<>();
        find(items);
    }

    private void find(List<Item> items) {
        if (items.size() > 0) {
            checkItemSet(items);
        }
        for (int i = 0; i < items.size(); i++) {
            List<Item> newItemList = new ArrayList<>(items);
            newItemList.remove(i);
            find(newItemList);
        }
    }

    public void show() {
        System.out.println("Weight : " + calculateWeight(bestItems));
        System.out.println("Price : " + bestPrice);
        System.out.println(bestItems);
    }

    private int calculateWeight(List<Item> items) {
        int sumWeight = 0;
        for (Item item : items) {
            sumWeight += item.getWeight();
        }
        return sumWeight;
    }

    private int calculatePrice(List<Item> items) {
        int sumPrice = 0;
        for (Item item : items) {
            sumPrice += item.getPrice();
        }
        return sumPrice;
    }

    private void checkItemSet(List<Item> items) {
        if (bestItems.isEmpty()) {
            if (calculateWeight(items) <= maxWeight) {
                bestItems = items;
                bestPrice = calculatePrice(items);
            }
        } else {
            if (calculateWeight(items) <= maxWeight && calculatePrice(items) > bestPrice) {
                bestItems = items;
                bestPrice = calculatePrice(items);
            }
        }
    }
}
