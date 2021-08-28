package ru.postlife.ads.lesson4.linkedlist;

import ru.postlife.ads.lesson3.queue.Queue;

public class LinkedQueueImpl<E> implements Queue<E> {

    private final TwoSideLinkedList<E> data;

    public LinkedQueueImpl() {
        this.data = new TwoSideLinkedListImpl<>();
    }

    @Override
    public boolean insertLast(E value) {
        data.insertLast(value);
        return true;
    }

    @Override
    public E removeFirst() {
        return data.removeFirst();
    }

    @Override
    public E peekFirst() {
        return data.getFirst();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void display() {
        data.display();
    }

    @Override
    public String toString() {
        return "LinkedQueueImpl{" + "data=" + data + '}';
    }
}
