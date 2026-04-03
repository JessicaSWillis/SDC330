/**
 * Jessica Willis
 * 3/28/2026
 * IC 2.2
 */

public class GroceryOrder extends DeliveryItem{
    private String orderSize;

    public GroceryOrder(String itemName, String orderSize) {
        super(itemName);
        setOrderSize(orderSize);
    }

    public String getOrderSize() {
        return orderSize;
    }

    public void setOrderSize(String orderSize) {
        this.orderSize = orderSize;
    }

    @Override
    public String toString() {
        return "Item: " + getItemName() +
            "\nSize: " + orderSize +
            "\nDestination: " + getDestination() +
            "\nPrepared: " + isPrepared() +
            "\nDelivered " + isDelivered() + "\n"; 
    }
}
