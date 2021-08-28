package ru.postlife.ads.lesson3;

import ru.postlife.ads.lesson3.deque.Deque;
import ru.postlife.ads.lesson3.deque.DequeueImpl;

public class MainApp {
    public static void main(String[] args) {
        find();
        deque();
    }

    private static void deque() {
        Deque<Integer> dequeue = new DequeueImpl<>(5);
        dequeue.insertFirst(0);
        dequeue.insertFirst(4);
        dequeue.insertLast(1);
        dequeue.insertLast(2);
        dequeue.insertLast(3);
        dequeue.insertLast(4);
        dequeue.insertLast(5);
        dequeue.display();

        dequeue.removeFirst();
        dequeue.removeFirst();
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
        dequeue.removeLast();
        dequeue.display();

        dequeue.insertFirst(1);
        dequeue.insertFirst(2);
        dequeue.display();
    }

    public static void find() {
        int[] arr = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15
        };
        int[] arr1 = new int[]{
                1, 2, 3, 5, 6
        };
        int[] arr2 = new int[]{};

        System.out.println(findMissNum(arr, 0, arr.length - 1));
        System.out.println(findMissNum(arr1, 0, arr1.length - 1));
        System.out.println(findMissNum(arr2, 0, arr2.length - 1));
    }

    public static int findMissNum(int[] intArray, int left, int right) {
        if (intArray.length == 0) {
            return 1;
        }
        if (right == left + 1) return intArray[right] - 1;
        int pivot = left + (right - left) / 2;
        if (intArray[pivot] == intArray[left] + (intArray[right] - intArray[left]) / 2 - (right - left) % 2)
            return findMissNum(intArray, pivot, right);
        else
            return findMissNum(intArray, left, pivot);
    }
}
