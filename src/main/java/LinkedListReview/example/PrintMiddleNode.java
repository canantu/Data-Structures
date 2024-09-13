package LinkedListReview.example;

public class PrintMiddleNode {

    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();
        for (int i = 0; i < 7; i++) {
            list.add(i);
        }
        printMiddle(list);
    }

    public static void printMiddle(MySinglyLinkedList list){
        Node slow = list.head;
        Node fast = list.head;

        while(fast != list.tail && fast.next != list.tail){
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast == list.tail){
            System.out.println(slow.id);
        }else {
            System.out.println(slow.id + " " + slow.next.id);
        }
    }
}
