/*
Jessica Willis
3/14/26
gp 2.2
*/

public class Vegetable extends Food {
    private String plantingSeason;
    private String harvestSeason;

    public Vegetable(String name, String servingSize, String plantingSeason, String harvestseason) {
        super(name, servingSize);
        this.plantingSeason = plantingSeason;
        this.harvestSeason = harvestseason;
    }

    public String getPlantingSeason() {
        return plantingSeason;
    }

    public void setPlantingSeason(String plantingSeason) {
        this.plantingSeason = plantingSeason;
    }

    public String getHarvestSeason() {
        return harvestSeason;
    }

    public void setHarvestSeason(String harvestSeason) {
        this.harvestSeason = harvestSeason;
    }

    @Override
    public String toString() {
        return String.format( "%sPlanting Time: %s%nHarvest Time: %s%n",
            super.toString(), plantingSeason, harvestSeason);
    }

}
