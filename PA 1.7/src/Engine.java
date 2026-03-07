/**
 * Name: Jessica Willis
 * Date: 3/6/2026
 * Assignment: SDC330 Performance Assessment - Composition
 * Description: Represents engine information of an automobile.
 */
public class Engine {
    private int cylinders;
    private String gasType;
    private boolean fuelInjected;

    // Constructor
    public Engine(int cylinders, String gasType, boolean fuelInjected) {
        setCylinders(cylinders);
        setGasType(gasType);
        setFuelInjected(fuelInjected);
    }

    // Getters and Setters
    public int getCylinders() { return cylinders; }
    public void setCylinders(int cylinders) { this.cylinders = cylinders; }

    public String getGasType() { return gasType; }
    public void setGasType(String gasType) { this.gasType = gasType; }

    public boolean isFuelInjected() { return fuelInjected; }
    public void setFuelInjected(boolean fuelInjected) { this.fuelInjected = fuelInjected; }

    @Override
    public String toString() {
        return "Engine [Cylinders=" + cylinders + ", GasType=" + gasType + ", FuelInjected=" + fuelInjected + "]";
    }
}