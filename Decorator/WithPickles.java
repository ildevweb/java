package Decorator;

public class WithPickles extends RacletteDecorator {
    public Raclette raclette;

    public WithPickles(Raclette raclette) {
        super(raclette);
        this.raclette = raclette;
    }

    public int getCalories() {
        return raclette.getCalories()+50;
    }

    public String getIngredients() {
        return raclette.getIngredients()+", cornichons";
    }

    public String toString() {
        return String.format("%s pour %d calories", this.getIngredients(), this.getCalories());
    }
}
