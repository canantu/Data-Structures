package LinkedListReview.example;

import java.util.ArrayList;

public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty(){
        return head == null;
    }


    void add(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = tail = newNode;
        } else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    void deleteById(int id){
        // check if empty
        if (isEmpty()){
            System.out.println("List is empty");
        }
        Node prev = head;
        Node current = head;

        while(current != null){
            if (current.id == id){
                if (current == head){
                    head = current.next;
                    current.next = null;
                }else if (current == tail){
                    tail = prev;
                    prev.next = null;
                }else{
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }
            // move to the other elements
            prev = current;
            current = current.next;
        }
    }

    void printNodes(){
        Node current = head;
        while (current != null){
            if(current.next != null){
                System.out.print(current.id + " => ");
            }else System.out.print(current.id + " => null");
            current = current.next;
        }
    }


    int indexOf(int id){
        if(isEmpty()) return -1;
        int pos = 0;
        // iterate through the list
        Node current = head;
        while(current != null){
            if (current.id == id){
                return pos;
            }
            pos++;
            current = current.next;
        }
        return -1;
    }

    // add an item to the beginning
    void addFirst(int id){
        Node node = new Node(id);
        if (isEmpty()){
            head = tail = node;
        }else{
            node.next = head;
            head = node;
        }
        size++;
    }
}
