/*
Jessica Willis
3/21/2026
2.5
*/

public class SplitLevel extends House {
    private boolean entryLevelLivingSpace;

    public SplitLevel(String streetAddress, String exteriorMaterial,
                String color, int numRooms, boolean entryLevelLivingSpace) {
        super(streetAddress, 2, exteriorMaterial, color, numRooms);
        setEntryLevelLivingSpace(entryLevelLivingSpace);
    }

    public boolean isEntryLevelLivingSpace() {
        return entryLevelLivingSpace;
    }

    public void setEntryLevelLivingSpace(boolean entryLevelLivingSpace) {
        this.entryLevelLivingSpace = entryLevelLivingSpace;
    }

   @Override
   public String toString(){
    String entryText = entryLevelLivingSpace ? "has" : "Does not have";
    return super.toString() + "It is a split level that " + entryText + " entry level living space.\n";
   } 
}
