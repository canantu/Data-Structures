package LinkedListReview;

public class TelemetryTest {

    public static void main(String[] args) {


        TelemetryList list = new TelemetryList();
        list.insertLast(new TelemetryNode(1, "Aircraft1" ));
        list.insertLast(new TelemetryNode(2, "Aircraft2" ));
        list.insertLast(new TelemetryNode(3, "Aircraft3" ));
        list.insertLast(new TelemetryNode(4, "Ground Control" ));

        list.printNodes();
        System.out.println();
        list.deleteByName("Aircraft1");
        list.printNodes();

    }
}
