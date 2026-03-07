/**
 * Name: Jessica Willis
 * Date: 3/6/2026
 * Assignment: SDC330 Performance Assessment - Inheritance
 * Description: Represents a truck with load capacity and towing capability.
 */
public class Truck extends Motorized {
    // Private member variables
    private String load;
    private boolean towing;

    // Constructor
    public Truck(int wheels, String color, boolean moving, int seats, String engine, boolean automatic, String load, boolean towing) {
        super(wheels, color, moving, seats, engine, automatic);
        this.load = load;
        this.towing = towing;
    }

    // Getters and Setters
    public String getLoad() { return load; }
    public void setLoad(String load) { this.load = load; }

    public boolean canTow() { return towing; }
    public void setTowing(boolean towing) { this.towing = towing; }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", Truck [Load=" + load + ", Towing=" + towing + "]";
    }
}