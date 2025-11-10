package Decorator;

public class WithColdMeats extends RacletteDecorator {
    public Raclette raclette;

    public WithColdMeats(Raclette raclette) {
        super(raclette);
        this.raclette = raclette;
    }

    public int getCalories() {
        return raclette.getCalories()+350;
    }

    public String getIngredients() {
        return raclette.getIngredients()+", charcuterie";
    }

    public String toString() {
        return String.format("%s pour %d calories", this.getIngredients(), this.getCalories());
    }
}
