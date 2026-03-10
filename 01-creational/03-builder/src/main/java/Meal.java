import java.util.Objects;

public class Meal {
    private final Burger burger;
    private final Drink drink;
    private final Fries fries;

    public static class Builder{
        private final Burger burger;
        private Drink drink;
        private Fries fries;

        Builder(Burger burger){
            this.burger = Objects.requireNonNull(burger, "burger must be not null");
        }

        public Builder drink(Drink drink){
            this.drink = drink;
            return this;
        }
        public Builder fries(Fries fries){
            this.fries = fries;
            return this;
        }
    }
}
