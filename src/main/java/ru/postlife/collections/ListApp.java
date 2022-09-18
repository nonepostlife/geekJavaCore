package ru.postlife.collections;

import ru.postlife.collections.linked.ILinkedList;
import ru.postlife.collections.linked.LinkedListImpl;
import ru.postlife.collections.list.ArrayListImpl;
import ru.postlife.collections.list.IArrayList;

public class ListApp {
    public static void main(String[] args) {
        ILinkedList<Integer> linkedList = new LinkedListImpl<>();
        System.out.println(linkedList.size());
        linkedList.insertFirst(3);
        linkedList.insertFirst(2);
        linkedList.insertFirst(1);
        linkedList.display();
        System.out.println(linkedList.contains(2));
        linkedList.remove(2);
        System.out.println(linkedList.contains(2));
        linkedList.display();
        System.out.println(linkedList.getFirst());


        IArrayList<Double> arrayList = new ArrayListImpl<>();
        for (int i = 0; i < 15; i++) {
            arrayList.add(i + 0.2);
        }
        arrayList.display();
        System.out.println(arrayList.contains(5.2));
        System.out.println(arrayList.contains(17.2));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.indexOf(4.2));
        System.out.println(arrayList.indexOf(10.2));
        arrayList.display();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(i);
        }
        arrayList.display();
        System.out.println(arrayList.size());
        arrayList.remove(3.2);
        arrayList.remove(11.2);
        arrayList.display();
    }
}
