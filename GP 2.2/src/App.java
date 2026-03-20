/*
Jessica Willis
3/14/26
gp 2.2
*/
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis gp 2.2");

        Food food = new Food("Food CLass", "Undefined");
        Vegetable veg = new Vegetable("Romaine Lettuce", "3 cups", "Spring", "Summer");
        Corn corn = new Corn("One Ear", "Spring", "Summer/Fall", "Sliver Queen Sweet", "4 ears per tray");
        Meat meat = new Meat("Angus Beef", "6 oz", "Free Range Grass Fed");

        ArrayList<Food> foods = new ArrayList<Food>();
        foods.add(food);
        foods.add(veg);
        foods.add(corn);
        foods.add(meat);

        System.out.println("Items in foods ArrayList:\n");
        for(Food f : foods) {
            printFoodInfo(f);
        }

        ArrayList<Vegetable> veggies = new ArrayList<>();
        veggies.add(veg);
        veggies.add(corn);

        System.out.println("Items in veggies ArrayList:\n");
        for(Vegetable v : veggies) {
            printFoodInfo(v);
        }
    }

    private static void printFoodInfo(Food food) {
        System.out.println(food.toString());
    }
}
