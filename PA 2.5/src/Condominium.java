/*
Jessica willis
3/21/2026
2.5
*/

public class Condominium extends Building {
    private int numUnits;

    public Condominium(String streetAddress, int numFloors, String exteriorMaterial, int numUnits) {
        super(streetAddress, numFloors, exteriorMaterial);
        setNumUnits(numUnits);
    }

    public int getNumUnits() {
        return numUnits;
    }

    public void setNumUnits(int numUnits) {
        this.numUnits = numUnits;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIt is a condominium that contains " +
            numUnits + " units.\n";
    }

    

}
