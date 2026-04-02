/*
Jessica willis
3/21/2026
2.5
*/

public class House extends Building {
    private String color;
    private int numRooms;

    public House(String streetAddress, int numFloors, String exteriorMaterial,
            String color, int numRooms) {
        super(streetAddress, numFloors, exteriorMaterial);
        setColor(color);
        setNumRooms(numRooms);

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIt is a house that contains " + numRooms + " rooms.\n";
    }

}
