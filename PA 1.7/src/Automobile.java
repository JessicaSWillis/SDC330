/**
 * Name: Jessica Willis
 * Date: 3/6/2026
 * Assignment: SDC330 Performance Assessment - Composition
 * Description: Represents an automobile composed of engine and tire components.
 */

import java.util.ArrayList;
import java.util.List;

public class Automobile {
    private String make;
    private String model;
    private String color;
    private String bodyStyle;
    private Engine engine;
    private List<Tire> tires;

    // Constructor
    public Automobile(String make, String model, String color, String bodyStyle, Engine engine) {
        setMake(make);
        setModel(model);
        setColor(color);
        setBodyStyle(bodyStyle);
        setEngine(engine);
        this.tires = new ArrayList<>(); // Initialize the list
    }

    // Getters and Setters
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getBodyStyle() { return bodyStyle; }
    public void setBodyStyle(String bodyStyle) { this.bodyStyle = bodyStyle; }

    public Engine getEngine() { return engine; }
    public void setEngine(Engine engine) { this.engine = engine; }

    public List<Tire> getTires() { return tires; }

    // Methods to add tires
    public void addTire(Tire tire) {
        tires.add(tire);
    }

    public void addTire(String manufacturer, String size, int maxPressure, int minPressure, String type) {
        tires.add(new Tire(manufacturer, size, maxPressure, minPressure, type));
    }

    // Method to get basic info
    public String getBasicInfo() {
        return "Make: " + getMake() +
               ", Model: " + getModel() +
               ", Color: " + getColor() +
               ", Cylinders: " + engine.getCylinders() +
               ", Fuel Injected: " + engine.isFuelInjected() +
               ", Number of Tires: " + tires.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Automobile [Make=").append(make)
          .append(", Model=").append(model)
          .append(", Color=").append(color)
          .append(", BodyStyle=").append(bodyStyle)
          .append(", Engine=").append(engine.toString())
          .append(", Tires=\n");
        for (Tire tire : tires) {
            sb.append("\t").append(tire.toString()).append("\n");
        }
        sb.append("]");
        return sb.toString();
    }
}