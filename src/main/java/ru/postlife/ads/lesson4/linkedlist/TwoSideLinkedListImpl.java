package ru.postlife.ads.lesson4.linkedlist;

public class TwoSideLinkedListImpl<E> extends SimpleLinkedListImpl<E> implements TwoSideLinkedList<E> {

    protected Node<E> lastElement;

    @Override
    public void insertFirst(E value) {
        if (isEmpty()) {
            super.insertFirst(value);
            if (size == 1) {
                lastElement = firstElement;
            }
        } else {
            Node<E> newNode = new Node<>(value, firstElement);
            firstElement.previous = newNode;
            firstElement = newNode;
            size++;
        }
    }

    @Override
    public void insertLast(E value) {
        Node<E> newNode = new Node<>(value, null, lastElement);

        if (isEmpty()) {
            insertFirst(value);
            return;
        }

        lastElement.next = newNode;
        lastElement = newNode;
        size++;
    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        Node<E> removedNode = lastElement;
        lastElement = removedNode.previous;
        lastElement.next = null;
        removedNode.previous = null;
        size--;

        if (isEmpty()) {
            lastElement = null;
        }

        return removedNode.item;
    }

    @Override
    public E getLast() {
        return getValue(lastElement);
    }

    @Override
    public E removeFirst() {
        E removedValue = super.removeFirst();

        if (isEmpty()) {
            lastElement = null;
        }

        return removedValue;
    }

    @Override
    public boolean remove(E value) {
        Node<E> current = firstElement;
        Node<E> previous = null;

        while (current != null) {
            if (current.item.equals(value)) {
                break;
            }
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        } else if (current == firstElement) {
            removeFirst();
            return true;
        } else if (current == lastElement) {
            lastElement = previous;
            previous.next = null;
        } else {
            previous.next = current.next;
        }

        current.next = null;
        size--;

        return true;
    }
}
