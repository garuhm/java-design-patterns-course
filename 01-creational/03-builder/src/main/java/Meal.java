import java.util.Objects;

public class Meal {
    private final Burger burger;
    private final Drink drink;
    private final Fries fries;

    private Meal(Builder builder){
        this.burger = builder.burger;
        this.drink = builder.drink;
        this.fries = builder.fries;
    }

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

        public Meal build(){
            return new Meal(this);
        }
    }

    @Override
    public String toString() {
        return "Meal{" +
                "burger=" + burger +
                ", drink=" + (drink != null ? drink + "": "None") +
                ", fries=" + (fries != null ? fries + "": "None") +
                '}';
    }

    public Burger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public Fries getFries() {
        return fries;
    }
}
