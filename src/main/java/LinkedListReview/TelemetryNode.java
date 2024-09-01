package LinkedListReview;

public class TelemetryNode {

    int internalId;
    int externalId; // will come from API which will not be implemented
    String name;
    TelemetryNode next; // in order to keep address of Telemetry node objects


    public TelemetryNode(int internalId, String name) {
        this.internalId = internalId;
        this.name = name;
    }
}
