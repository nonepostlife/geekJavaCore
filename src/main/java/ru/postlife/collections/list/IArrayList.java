package ru.postlife.collections.list;

public interface IArrayList<E> {
    void add(E element);

    boolean remove(E element);

    E remove(int index);

    boolean contains(E element);

    int size();

    boolean isEmpty();

    E get(int index);

    void clear();

    int indexOf(E element);

    void display();
}
