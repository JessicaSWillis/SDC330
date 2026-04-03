/**
 * Jessica Willis
 * 3/28/2026
 * IC 2.2
 */

public class PizzaOrder extends DeliveryItem {
    private String size;

    public PizzaOrder(String itemName, String size) {
        super(itemName);
        setSize(size);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Item: " + getItemName() +
            "\nSize: " + size +
            "\nDestination: " + getDestination() +
            "\nPrepared: " + isPrepared() +
            "\nDelivered " + isDelivered() + "\n";
    }

}
