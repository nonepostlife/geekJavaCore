package ru.postlife.ads.lesson3.deque;

import ru.postlife.ads.lesson3.queue.Queue;

public interface Deque<E> extends Queue<E> {

    boolean insertLeft(E value);
    E removeRight();
    E peekBack();
}