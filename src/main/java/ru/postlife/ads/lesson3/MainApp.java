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
        dequeue.insertLeft(0);
        dequeue.insertLeft(4);
        dequeue.insertRight(1);
        dequeue.insertRight(2);
        dequeue.insertRight(3);
        dequeue.insertRight(4);
        dequeue.insertRight(5);
        dequeue.display();

        dequeue.removeLeft();
        dequeue.removeLeft();
        dequeue.display();

        dequeue.removeRight();
        System.out.println(dequeue.peekBack());
        System.out.println(dequeue.peekFront());
        dequeue.display();

        dequeue.insertLeft(7);
        dequeue.insertLeft(7);
        dequeue.insertLeft(7);
        dequeue.display();

        dequeue.removeRight();
        dequeue.removeRight();
        dequeue.removeRight();
        dequeue.removeRight();
        dequeue.removeRight();
        dequeue.display();

        dequeue.insertLeft(1);
        dequeue.insertLeft(2);
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
