package ru.postlife.ads.lesson3.deque;

public class DequeueImpl<E> implements Deque<E> {

    private final E[] data;
    private int size;

    private final int HEAD_DEFAULT = 0;
    private final int TAIL_DEFAULT = -1;

    private int tail;
    private int head;

    public DequeueImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        tail = TAIL_DEFAULT;
        head = HEAD_DEFAULT;
    }

    @Override
    public boolean insertFirst(E value) {
        if (isFull()) {
            return false;
        }
        if (head == 0 && isEmpty()) {
            data[head] = value;
            size++;
            tail++;
            return true;
        }
        if (head != 0) {
            data[--head] = value;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public boolean insertLast(E value) {
        if (isFull() || tail == data.length - 1) {
            return false;
        }
        data[++tail] = value;
        size++;
        return true;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E value = data[head++];
        size--;
        return value;
    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        E value = data[tail--];
        size--;
        return value;
    }

    @Override
    public E peekFirst() {
        return data[head];
    }

    @Override
    public E peekLast() {
        return data[tail];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = head; i <= tail; i++) {
            sb.append(data[i]);
            if (i != tail) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
