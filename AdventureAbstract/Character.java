package AdventureAbstract;

import java.util.List;
import java.util.ArrayList;


public abstract class Character {
    int maxHealth;
    int currentHealth;
    String name;
    private static List<Character> allCharacters = new ArrayList<>();

    public Character(String name, int maxHealth) {
        this.name = name;
        this.currentHealth = maxHealth;
        this.maxHealth = maxHealth;

        allCharacters.add(this);
    }


    public static Character fight(Character c1, Character c2) {

        while (c1.currentHealth > 0 && c2.currentHealth > 0) {
            c1.attack(c2);
            if (c2.currentHealth <= 0) {
                return c1;
            }

            c2.attack(c1);
            if (c1.currentHealth <= 0) {
                return c2;
            }
        }

        return (c1.currentHealth > 0) ? c1 : c2;
    }


    /*public void takeDamage(int n) {
        if (this.currentHealth >= n) {
            this.currentHealth -= n;
        } else {
            this.currentHealth = 0;
        }
    }

    public void attack(Character c) {
        c.takeDamage(9);
    }*/

    abstract void takeDamage(int n);

    abstract void attack(Character c);

    public static String printStatus() {
        String result = "------------------------------------------";

        if (allCharacters.isEmpty()) {
            result += "\n";
            result += "Nobody's fighting right now !";
        } else {
            result += "\nCharacters currently fighting : ";
        }

        for (Character elem : allCharacters) {
            result += "\n";
            result += "- "+elem.toString();
        }

        result += "\n------------------------------------------";

        return result;
    }

    @Override
    public String toString() {
        if (this.currentHealth != 0) {
            return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
        }
        
        return String.format("%s : KO", this.name);
    }
}