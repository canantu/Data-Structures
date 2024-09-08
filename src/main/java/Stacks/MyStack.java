package Stacks;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyStack<T> {

    public SNode<T> bottom;
    public SNode<T> top;
    int size;

    public boolean isEmpty(){
        return bottom == null && top == null;
    }

    public void push(T item){
        SNode<T> node = new SNode<>(item);
        if(isEmpty()){
            bottom = top = node;
        }else {
            top.next = node;
            top = node;
        }
        size++;
    }

    public T pop(){
        SNode peekNode;
        if(isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }

        // stack has one element
        if (top == bottom){
            peekNode = top;
            top = bottom = null;
        }else {
            peekNode = top;
            SNode<T> prev = bottom;
            while(prev.next != top){
                prev = prev.next;
            }
            top = prev;
            prev.next = null;
        }
        size--;
        return (T) peekNode.value;
    }

    public T peek(){
        return (T) top.value;
    }





}
