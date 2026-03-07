/**
 * Name: Jessica Willis
 * Date: 3/6/2016
 * Assignment: SDC330 Performance Assessment - Inheritance
 * Description: Represents a car with a sunroof and storage.
 */
public class Car extends Motorized {
    // Private member variables
    private boolean sunRoof;
    private String storage;

    // Constructor
    public Car(int wheels, String color, boolean moving, int seats, String engine, boolean automatic, boolean sunRoof, String storage) {
        super(wheels, color, moving, seats, engine, automatic);
        this.sunRoof = sunRoof;
        this.storage = storage;
    }

    // Getters and Setters
    public boolean hasSunRoof() { return sunRoof; }
    public void setSunRoof(boolean sunRoof) { this.sunRoof = sunRoof; }

    public String getStorage() { return storage; }
    public void setStorage(String storage) { this.storage = storage; }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", Car [SunRoof=" + sunRoof + ", Storage=" + storage + "]";
    }
}