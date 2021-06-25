package ru.postlife.java3.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWorkApp {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        System.out.println("Вес первой коробки яблок " + appleBox1.getWeight());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());
        System.out.println("Вес второй коробки яблок " + appleBox2.getWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        System.out.println("Вес коробки апельсин " + orangeBox.getWeight());

        System.out.println("Сравнение веса первой коробки яблок со второй коробкой яблок - " + appleBox1.compare(appleBox2));
        System.out.println("Сравнение веса первой коробки яблок с коробкой апельсин - " + appleBox1.compare(orangeBox));

        appleBox1.moveAll(appleBox2);
        System.out.println("Вес первой коробки яблок после перемещения " + appleBox1.getWeight());
        System.out.println("Вес второй коробки яблок после перемещения " + appleBox2.getWeight());

        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> list = createListFromArray(array);
        System.out.println("list from array - " + list);
        swapTwoElementArray(array, 3, 0);
        System.out.println("array after swap elements - " + Arrays.toString(array));

        String[] strings = new String[]{"a", "b", "c"};
        swapTwoElementArray(strings, 0, 1);
        System.out.println("array - " + Arrays.toString(strings));
        List<String> stringList = createListFromArray(strings);
        System.out.println("list from array - " + stringList);

    }

    public static <T> void swapTwoElementArray(T[] array, int firstIndex, int secondIndex) {
        if (array.length < firstIndex || array.length < secondIndex || firstIndex == secondIndex) {
            return;
        }
        T temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static <T> ArrayList<T> createListFromArray(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
