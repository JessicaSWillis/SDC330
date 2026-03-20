/*
Jessica Willis
3/14/26
2.2
*/

public class Corn extends Vegetable{
    private String variety;
    private String packaging;

    public Corn(String servingSize, String plantingSeason, String harvestSeason, String variety, String packaging) {
        super(variety + " Corn", servingSize, plantingSeason, harvestSeason);
        this.variety = variety;
        this.packaging = packaging;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    @Override
    private String toString() {
        return String.format(
            "%sType of Corn: %s%nPackage Description: %s%n",
            super.toString(), variety, packaging);
    }

}
