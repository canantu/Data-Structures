package LinkedListReview.example;

public class SinglyListedListApp {

    public static void main(String[] args) {

        MySinglyLinkedList myList = new MySinglyLinkedList();
        System.out.println(myList.isEmpty());

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

        myList.printNodes();

        System.out.println();

        myList.removeKthFromLast(2);
        myList.printNodes();

        System.out.println();

        myList.removeKthFromLast(10);
        myList.printNodes();

        myList.deleteById(5);

        System.out.println();

        myList.printNodes();

        System.out.println();

        System.out.println("index of 8: " + myList.indexOf(8));


    }
}
