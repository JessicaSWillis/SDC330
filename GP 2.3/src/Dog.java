/*
Jessica willis
3/20/2026
gp 2.3
*/

public class Dog implements Animal {
    private String name;
    private String favoriteActivity;
    public Dog(String name, String favAct) {
        this.name = name;
        favoriteActivity = favAct;
    }
    @Override
    public String getName() {
        return name;
    }
    public String getFavoriteActivity() {
        return favoriteActivity;
    }
    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }
    @Override
    public String makeSound() {
        return "Bow wow wow woof woof";
    }
    @Override
    public void move(String start, String end) {
        System.out.println("Bounding from " + start + " to " + end);
    }
    @Override
    public String toString() {
        return String.format("Dog Information: %nName: %s%nFavorite Activity: %s%n",
        name, favoriteActivity);
    }
    

}
