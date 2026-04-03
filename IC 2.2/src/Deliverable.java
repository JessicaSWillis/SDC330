/**
 * Jessica Willis
 * 3/28/2026
 * IC 2.2
 */

public interface Deliverable {
    String getItemName();
    String getDestination();
    void markPrepared();
    void markDelivered();
    void assignDestination(String Destination);
}
