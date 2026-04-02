/*
Jessica Willis
3/21/2026
2.6
*/

public class Car implements Vehicle {
    private String make;
    private String model;
    private boolean running;
    private String destination;

    public Car(String make, String model) {
        setMake(make);
        setModel(model);
        setRunning(false);
        setDestination("nowhere");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public void start() {
        setRunning(true);
    }

    @Override
    public void stop() {
        setRunning(false);
    }

    @Override
    public void drive(String destination) {
        setDestination(destination);
    }

    @Override
    public String toString() {
        String status = running ? "running" : "not running";
        return "Make: " + make +
        "\nModel: " + model +
        "\nThe car is " + status +
        "and is heading to " + destination + ".\n";
    }

}
