package ru.postlife.java.oop.homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name) {
        this.name = name;
        this.hungry = true;
        appetite = (int) (Math.random() * 5) + 5;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void eat(Plate plate) {

        if (plate.decreaseFood(appetite)) {
            hungry = false;
            System.out.println(name + " покушал");
        } else {
            System.out.println(name + " не покушал. В тарелке не хватило еды");
        }
    }

    public void info() {
        System.out.printf("КОТ Имя: %s Аппетит: %d Голоден: %s\n", name, appetite, hungry);
    }
}
