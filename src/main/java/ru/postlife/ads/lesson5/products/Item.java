package ru.postlife.ads.lesson5.products;

public class Item {
    private String name;
    private int weight;
    private int price;

    public Item(String name, int weight, int cost) {
        this.name = name;
        this.weight = weight;
        this.price = cost;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                "}\n";
    }
}
