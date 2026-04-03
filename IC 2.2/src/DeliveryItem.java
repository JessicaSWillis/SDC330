/**
 * Jessica Willis
 * 3/28/2026
 * IC 2.2
 */

public abstract class DeliveryItem implements Deliverable {
    private String itemName;
    private String destination;
    private boolean prepared;
    private boolean delivered;

    public DeliveryItem(String itemName) {
        setItemName(itemName);
        setDestination("");
        setPrepared(false);
        setDelivered(false);
    }

    public String getItemName() {
        return itemName;
    }

    public String getDestination () {
        return destination;
    }

    public boolean isPrepared() {
        return prepared;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setPrepared(boolean prepared) {
        this.prepared = prepared;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public void markPrepared() {
        setPrepared(true);
    }

    public void markDelivered() {
        setDelivered(true);
    }

    public void assignDestination(String destination) {
        setDestination(destination);
    }

    public abstract String toString();
    

}
