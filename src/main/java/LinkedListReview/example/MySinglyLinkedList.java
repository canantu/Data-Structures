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

    public int getKthFromLast(int k){
        // create two pointers
        Node ptr1 = head;
        Node ptr2 = head;

        // move ptr2 k-1 times
        for (int i = 0; i < k-1; i++) {
            ptr2 = ptr2.next;
        }

        // move both pointers until ptr2 hits the last element
        while(ptr2 != null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1.id;
    }

    public int removeKthFromLast(int k){
        // create two pointers
        Node ptr1 = head;
        Node ptr2 = head;
        Node prev = null;

        // move ptr2 k-1 times
        for (int i = 0; i < k-1; i++) {
            ptr2 = ptr2.next;
        }
        // move both pointers until ptr2 hits the last element
        while(ptr2.next != null){
            prev = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;

        }
        // delete operation
        if (ptr1 == head){
            head = ptr1.next;
            ptr1.next = null;


        }else if(ptr1 == tail){
            tail = prev;
            prev.next = null;

        }else{
            prev.next = ptr1.next;
            ptr1.next = null;

        }
        size--;
        return ptr1.id;
    }


    public void removeKthFromLastSecondSolution(int k){
        Node ptr1 = head;
        Node ptr2 = head;

        for (int i = 0; i < k-1; i++) {
            ptr2 = ptr2.next;

            if (ptr2.next == null){
                System.out.println("Array is less than k elements");
            }else if (ptr2.next == null){
                head = ptr1.next;
                ptr1.next = null;
                return;
            }
        }

        while(ptr2.next.next != null){
            ptr2 = ptr2.next;
            ptr1 = ptr1.next;
        }
        ptr1.next = ptr2.next.next;
        ptr1 = ptr1.next;
        ptr1 = null;

    }
}
