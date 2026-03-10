public class Mainapp {
    public static void main(String[] args) {
        Meal meal1 = new Meal.Builder(Burger.CHEESE_BURGER).fries(Fries.FRENCH_FRIES).build();

        System.out.println(meal1);
    }
}
