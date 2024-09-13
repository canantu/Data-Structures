package LinkedListReview.example;

public class ReverseLinkedList {

    public static void main(String[] args) {

        MySinglyLinkedList list = new MySinglyLinkedList();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.printNodes();
        System.out.println("\nAfter reverse");
        reverse(list);
        list.printNodes();
    }

    public static void reverse(MySinglyLinkedList list) {
        Node prev = list.head;
        Node cur = list.head.next;

        while (cur != null) {
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        list.tail = list.head;
        list.tail.next = null;
        list.head = prev;
    }
}
