package ru.postlife.ads.lesson6;

public interface Tree<E extends Comparable<? super E>> {

    Node<E> getRoot();

    enum TraversMode {
        IN_ORDER, PRE_ORDER, POST_ORDER
    }

    boolean add(E value);

    boolean contains(E value);

    boolean remove(E value);

    boolean isEmpty();

    int size();

    void display();

    void traverse(TraversMode mode);

    int getLevel();

    int getMaxLevel();

    boolean isBalanced(Node<E> node);
}
