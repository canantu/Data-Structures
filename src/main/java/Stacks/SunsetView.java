package Stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetView {

    public static void main(String[] args) {

        int[] buildings = {3,5,4,4,3,1,3,2};
        sunsetViews(buildings, "west").forEach(System.out::println);

    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction){
        // stack to hold the indices that can see sunset
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int step = 1;
        // west
        if (direction.equalsIgnoreCase("west")){
            i = buildings.length-1;
            step = -1;
        }
        while (i >= 0 &&  i < buildings.length) {
            while(!stack.isEmpty() && buildings[stack.peek()] <= buildings[i]){
                stack.pop();
            }
            stack.push(i);
            i+= step;
        }
        if (direction.equalsIgnoreCase("west")){
            Collections.reverse(stack);
        }
        return new ArrayList<Integer>(stack);
    }
}
