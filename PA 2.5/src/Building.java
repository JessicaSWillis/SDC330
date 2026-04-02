/*
jessica willis
3/21/2026
2.5
*/

public class Building {
    private String streetAddress;
    private int numFloors;
    private String exteriorMaterial;

    public Building(String streetAddress, int numFloors, String exteriorMaterial) {
        setStreetAddress(streetAddress);
        setNumFloors(numFloors);
        setExteriorMaterial(exteriorMaterial);
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    public String getExteriorMaterial() {
        return exteriorMaterial;
    }

    public void setExteriorMaterial(String exteriorMaterial) {
        this.exteriorMaterial = exteriorMaterial;
    }

    @Override
    public String toString() {
        return "There is a " + numFloors + " story building at " +
            streetAddress + " made of " + exteriorMaterial + ".";
    }
    

}
