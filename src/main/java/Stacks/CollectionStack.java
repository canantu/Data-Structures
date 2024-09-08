package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class CollectionStack {

    public static void main(String[] args) {


        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

    }
}
