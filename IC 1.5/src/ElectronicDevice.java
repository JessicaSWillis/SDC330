/**
 * Name: Jessica Willis
 * Date: 3/6/2026
 * Assignment: In-Class Assignment 1: Mandatory Composition
 * Description: Superclass representing an electronic device with brand, power usage, and on/off status.
 */
public class ElectronicDevice {
    // Private member variables
    private String brand;
    private double powerUsage;
    private boolean isOn;

    // Constructor using setters
    public ElectronicDevice(String brand, double powerUsage, boolean isOn) {
        setBrand(brand);
        setPowerUsage(powerUsage);
        setOn(isOn);
    }

    // Getters and Setters
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public double getPowerUsage() { return powerUsage; }
    public void setPowerUsage(double powerUsage) { this.powerUsage = powerUsage; }

    public boolean isOn() { return isOn; }
    public void setOn(boolean isOn) { this.isOn = isOn; }

    // toString method
    @Override
    public String toString() {
        return "ElectronicDevice [Brand=" + getBrand() + ", PowerUsage=" + getPowerUsage() + "W, IsOn=" + isOn() + "]";
    }
}
