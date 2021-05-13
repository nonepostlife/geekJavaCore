package ru.postlife.java.oop.homework6;

public class HomeWorkApp6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 3);
        Cat cat1 = new Cat("Персик", 4);

        Dog dog = new Dog("Бобик", 2);
        Dog dog1 = new Dog("Шарик", 5);
        Dog dog2 = new Dog("Рекс", 7);

        cat.run(52);
        cat1.run(321);
        cat.swim(5);

        dog.run(800);
        dog1.run(426);
        dog2.swim(4);

        System.out.println("Создано животных - " + Animal.getCount());
        System.out.println("Создано котиков - " + Cat.getCount());
        System.out.println("Создано пёсиков - " + Dog.getCount());
    }
}
