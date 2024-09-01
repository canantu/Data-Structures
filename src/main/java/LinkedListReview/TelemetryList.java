package LinkedListReview;

public class TelemetryList {

    TelemetryNode head;
    TelemetryNode tail;
    int size;



    //methods
    boolean isEmpty(){
        return head==null;
    }

    void insertLast(TelemetryNode node){
        //case 1:  List is empty
        if (isEmpty()){
            head=tail=node;
            //case 2: List is not empty
        }else {
            tail.next = node;
            tail = node;
        }
    }

    void printNodes(){
        TelemetryNode current = head;
        while(current!=null){
            System.out.print(current.name + "=> ");
            current = current.next;
        }
    }

    void deleteByName(String vehicleName){
        TelemetryNode prev = head;
        TelemetryNode current = head;

        while(current != null){
            if (current.name.equals(vehicleName) ){
                // case1: deleting head
                if (current == head){
                    if (head == tail){ // there is only one element in the list
                        tail = null;
                    }
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    // case2: deleting last
                    prev.next = null;
                    tail = prev;
                }else {
                    // case3: deleting middle
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }
            prev = current;
            current = current.next;
        }
    }


}
