package Queues;

import java.util.NoSuchElementException;

public class MyQueue<T> {

    QNode<T> front;
    QNode<T> back;
    int size;

    public MyQueue() {

    }

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(T item) {
        QNode<T> newNode = new QNode<>(item);
        if (isEmpty()) {
            front = back = newNode;
        } else {
            back.next = newNode;
            back = newNode;
        }
        size++;
    }

    T dequeue() {
        QNode<T> frontNode;
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        if (front == back) {
            frontNode = front;
            front = back = null;
        } else {
            frontNode = front;
            front = front.next;
        }
        size--;
        return frontNode.value;
    }

    T peek() {
        return front.value;
    }

    int size() {
        return size;
    }


}
