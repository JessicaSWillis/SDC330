/*
Jessica willis
3/21/2026
2.6
*/

public class CargoTruck  implements Vehicle {
    private String make;
    private String model;
    private boolean running;
    private String destination;
    private String cargoCapacity;

    public CargoTruck(String make, String model, String cargoCapacity) {
        setMake(make);
        setModel(model);
        setCargoCapacity(cargoCapacity);
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

    public String getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
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
        String status = running ? "running" : "Not running";
        return "Make: " + make + "\nModel: " + model + "\nThe truck is " +
        status + " and hauling " + cargoCapacity + "of cargo to " + destination + ".";
    }

}
