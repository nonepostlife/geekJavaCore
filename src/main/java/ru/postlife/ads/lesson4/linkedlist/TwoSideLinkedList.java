package ru.postlife.ads.lesson4.linkedlist;

public interface TwoSideLinkedList<E> extends LinkedList<E> {

    void insertLast(E value);

    E removeLast();

    E getLast();

}
