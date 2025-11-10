package Decorator;

public abstract class RacletteDecorator implements Raclette {
    public Raclette raclette;

    public RacletteDecorator(Raclette raclette) {
        this.raclette = raclette;
    }

    public int getCalories() {
        return raclette.getCalories();
    }

    public String getIngredients() {
        return raclette.getIngredients();
    }

    public String toString() {
        return String.format("%s pour %d calories", this.getIngredients(), this.getCalories());
    }
}
