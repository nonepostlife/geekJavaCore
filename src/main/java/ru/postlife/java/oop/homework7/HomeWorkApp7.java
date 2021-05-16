package ru.postlife.java.oop.homework7;

public class HomeWorkApp7 {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat("Barsik"),
                new Cat("Pushok"),
                new Cat("Zefir"),
                new Cat("Begemot"),
                new Cat("Pirat")
        };
        Plate plate = new Plate(20);

        for (Cat i : cats) {
            i.info();
        }
        plate.info();
        System.out.println();

        for (Cat i : cats) {
            i.eat(plate);
            plate.info();
            System.out.println();
        }

        for (Cat i : cats) {
            i.info();
        }
        System.out.println();

        for (Cat i : cats) {
            while (i.isHungry()) {
                plate.addFood(5);
                i.eat(plate);
                plate.info();
                System.out.println();
            }
        }
    }
}
