package ru.postlife.ads.lesson3.deque;

import ru.postlife.ads.lesson3.queue.Queue;

public interface Deque<E> extends Queue<E> {

    boolean insertFirst(E value);
    E removeLast();
    E peekLast();
}