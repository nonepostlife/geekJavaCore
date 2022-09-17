package ru.postlife.collections.list;

import java.util.Arrays;

public class ArrayListImpl<E> implements IArrayList<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] objects;
    private int size;

    public ArrayListImpl() {
        this.objects = new Object[DEFAULT_CAPACITY];
        size = 0;
    }


    @Override
    public void add(E element) {
        objects[size++] = element;
        if ((double) size / objects.length > 0.75) {
            objects = Arrays.copyOf(objects, objects.length * 2);
        }
    }

    @Override
    public boolean remove(E element) {
        if (!contains(element)) {
            return false;
        }
        int removed = indexOf(element);
        return remove(removed) == null;
    }

    @Override
    public E remove(int index) {
        if (index > size)
            return null;
        E removedItem = (E) objects[index];
        Object[] newArray = new Object[objects.length];
        System.arraycopy(objects, 0, newArray, 0, index);
        System.arraycopy(objects, index + 1, newArray, index, size - (index + 1));
        size--;
        objects = newArray;
        if ((double) size / objects.length < 0.25) {
            int newLength = Math.max((objects.length / 2), DEFAULT_CAPACITY);
            objects = Arrays.copyOf(objects, newLength);
        }
        return removedItem;
    }

    @Override
    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (objects[i].equals(element)) {
                return true;
            }
        }
        return false;
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
    public E get(int index) {
        if (index > size)
            return null;
        return (E) objects[index];
    }

    @Override
    public void clear() {
        objects = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (objects[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(objects[i]);
            if (i < size - 1)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
