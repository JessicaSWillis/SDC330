/**
 * Name: Jessica Willis
 * Date: 3/6/2026
 * Assignment: SDC330 Performance Assessment - Composition
 * Description: Represents a tire for an automobile.
 */
public class Tire {
    private String manufacturer;
    private String size;
    private int maxPressure;
    private int minPressure;
    private String type;

    // Constructor
    public Tire(String manufacturer, String size, int maxPressure, int minPressure, String type) {
        setManufacturer(manufacturer);
        setSize(size);
        setMaxPressure(maxPressure);
        setMinPressure(minPressure);
        setType(type);
    }

    // Getters and Setters
    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    public int getMaxPressure() { return maxPressure; }
    public void setMaxPressure(int maxPressure) { this.maxPressure = maxPressure; }

    public int getMinPressure() { return minPressure; }
    public void setMinPressure(int minPressure) { this.minPressure = minPressure; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @Override
    public String toString() {
        return "Tire [Manufacturer=" + manufacturer + ", Size=" + size +
               ", MaxPressure=" + maxPressure + ", MinPressure=" + minPressure +
               ", Type=" + type + "]";
    }
}