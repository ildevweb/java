package Decorator;

public class BaseRaclette implements Raclette {

    public int getCalories() {
        return 1000;
    }

    public String getIngredients() {
        return "Patate, fromage à raclette";
    }

    public String toString() {
        return String.format("%s pour %d calories", this.getIngredients(), this.getCalories());
    }
}
