package LinkedListReview.example;

public class LinkedListDemo {

    public static void main(String[] args) {


        Node head = new Node(1);
        System.out.println("Address of the object" + head);
        System.out.println("Next object" + head.next);

        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node tail = new Node(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = tail;

        Node current;
        current = head;
        while (current != null){
            System.out.println(current.id);
            current = current.next;
        }


    }
}
