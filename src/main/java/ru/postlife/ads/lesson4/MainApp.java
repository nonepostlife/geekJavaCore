package ru.postlife.ads.lesson4;

import ru.postlife.ads.lesson3.deque.Deque;
import ru.postlife.ads.lesson4.linkedlist.SimpleLinkedListImpl;
import ru.postlife.ads.lesson4.linkedlist.TwoSideLinkedDequeue;


public class MainApp {
    public static void main(String[] args) {
        testDeque();
        testForEach();

    }

    private static void testForEach() {
        SimpleLinkedListImpl<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);

        for (Integer integer : linkedList) {
            System.out.print(integer + " ");
        }

        System.out.println();
        linkedList.remove(3);

        for (Integer integer : linkedList) {
            System.out.print(integer + " ");
        }
    }

    private static void testDeque() {
        Deque<Integer> dequeue = new TwoSideLinkedDequeue<>();
        dequeue.insertFirst(0);
        dequeue.insertFirst(1);
        dequeue.insertLast(1);
        dequeue.insertLast(2);
        dequeue.insertLast(3);
        dequeue.insertLast(4);
        dequeue.insertLast(5);
        dequeue.display();

        dequeue.removeFirst();
        dequeue.removeLast();
        dequeue.display();

        dequeue.removeLast();
        System.out.println(dequeue.peekLast());
        System.out.println(dequeue.peekFirst());
        dequeue.display();

        dequeue.insertFirst(7);
        dequeue.insertFirst(7);
        dequeue.insertFirst(7);
        dequeue.display();

        dequeue.removeLast();
        dequeue.removeLast();
        dequeue.removeLast();
        dequeue.removeLast();
        dequeue.insertFirst(1);
        dequeue.insertFirst(2);
        dequeue.display();
    }
}
