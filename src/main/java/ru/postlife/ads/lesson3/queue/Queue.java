package ru.postlife.ads.lesson3.queue;

public interface Queue<E> {

    boolean insertLast(E value);

    E removeFirst();

    E peekFirst();

    int size();

    boolean isEmpty();

    boolean isFull();

    void display();

}
