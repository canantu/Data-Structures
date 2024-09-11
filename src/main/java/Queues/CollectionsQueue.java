package Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class CollectionsQueue {

    public static void main(String[] args) {


        Deque<String> queue = new ArrayDeque<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("A");
        priorityQueue.add("C");
        priorityQueue.add("B");

        System.out.println(priorityQueue.peek());
    }
}
