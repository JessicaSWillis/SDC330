/*
Jessica Willis
3/14/2026
GP 2.2
*/

public class Food {
    private String name;
    private String servingSize;

    public Food(String name, String servingSize) {
        this.name = name;
        this.servingSize = servingSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServingSize() {
        return servingSize;
    }

    public void setServingSize(String servingSize) {
        this.servingSize = servingSize;
    }

    @Override
    public String toString() {
        return String.format(
            "Class Name (Object Type): %s%nFood Name: %s5=%nServing Size: %s%n",
            this.getClass().getName(), name, servingSize);
    }

}
