package ru.postlife.ads.lesson3.queue;

public interface Queue<E> {

    boolean insertRight(E value);

    E removeLeft();

    E peekFront();

    int size();

    boolean isEmpty();

    boolean isFull();

    void display();

}
