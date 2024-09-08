package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionStack {

    public static void main(String[] args) {


        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());


        Stack<Integer> stack2 = new Stack<>(); // there is also a stack imp
        stack2.push(4);

    }
}
