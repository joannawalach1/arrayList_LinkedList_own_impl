package pl.great.waw.company3.listimpl;

import org.w3c.dom.Node;

public class genericLinkedList implements ListIn {
    Object[] objects = new Object[14];
    private Node head;
    private Node tail;
    private int size;

    public genericLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public Object addElement(Object element) {
        Node newNode = new Node(element);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
        return element;
    }

    @Override
    public Object deleteElement(int index) {
        if (index >= 0 && index < size) {
            Object removedElement;

            if (index == 0) {
                removedElement = head.data;
                head = head.next;
                if (head == null) {
                    tail = null;
                }
            } else {
                Node<Object> prev = head;
                for (int i = 0; i < index - 1; i++) {
                    prev = prev.next;
                }

                removedElement = prev.next.data;
                prev.next = prev.next.next;

                if (prev.next == null) {
                    tail = prev;
                }
            }

            size--;
            return removedElement;
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }
    }


    @Override
    public Object getElement(int index) {
        if (index >= 0 && index < size) {
            Node currentNode = head;
            int currentIndex = 0;

            while (currentNode != null) {
                if (currentIndex == index) {
                    return currentNode.data;
                }
                currentNode = currentNode.next;
                currentIndex++;
            }

            throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds.");
        } else {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }
    }


    private class Node<E> {
        private E data;
        private Node<E> previous;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }
}

