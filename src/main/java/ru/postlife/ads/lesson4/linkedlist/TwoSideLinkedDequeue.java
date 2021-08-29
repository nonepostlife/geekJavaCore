package ru.postlife.ads.lesson4.linkedlist;

import ru.postlife.ads.lesson3.deque.Deque;

public class TwoSideLinkedDequeue<E> implements Deque<E> {

    private final TwoSideLinkedList<E> data;

    public TwoSideLinkedDequeue() {
        this.data = new TwoSideLinkedListImpl<>();
    }

    @Override
    public boolean insertFirst(E value) {
        data.insertFirst(value);
        return true;
    }

    @Override
    public E removeLast() {
        return data.removeLast();
    }

    @Override
    public E peekLast() {
        return data.getLast();
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
}
