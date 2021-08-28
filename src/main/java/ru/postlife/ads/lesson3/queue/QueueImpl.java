package ru.postlife.ads.lesson3.queue;

public class QueueImpl<E> implements Queue<E> {

    protected final E[] data;
    private final int HEAD_DEFAULT = 0;
    private final int TAIL_DEFAULT = -1;
    protected int size;

    protected int tail;
    protected int head;

    public QueueImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        head = HEAD_DEFAULT;
        tail = TAIL_DEFAULT;
    }

    @Override
    public boolean insertLast(E value) {
        if (isFull()) {
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
    public E peekFirst() {
        return data[head];
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
        StringBuilder sb = new StringBuilder("--> [");
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
