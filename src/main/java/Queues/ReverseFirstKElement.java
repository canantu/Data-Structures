package Queues;

import java.util.Stack;

public class ReverseFirstKElement {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();
        for (int i = 0; i < 6; i++) {
            myQueue.enqueue(i);
        }
        System.out.println("Before reverse");
        myQueue.printQueue();
        System.out.println("\nAfter reverse");
        reverseFirstKElement(myQueue, 3).printQueue();
    }

    public static MyQueue<Integer> reverseFirstKElement(MyQueue<Integer> myQueue, int k) {

        Stack<Integer> stack = new Stack<>();
        // push first k elements into stack
        for (int i = 0; i < k; i++) {
            stack.push(myQueue.dequeue());
        }
        // enqueue elements back into queue
        while (!stack.isEmpty()) {
            myQueue.enqueue(stack.pop());
        }
        for (int i = 0; i < myQueue.size()-k; i++) {
            myQueue.enqueue(myQueue.dequeue());
        }

        return myQueue;

    }
}
