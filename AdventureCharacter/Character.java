package AdventureCharacter;

public class Character {
    int maxHealth;
    int currentHealth;
    String name;

    public Character(String name, int maxHealth) {
        this.name = name;
        this.currentHealth = maxHealth;
        this.maxHealth = maxHealth;
    }

    public void takeDamage(int n) {
        if (this.currentHealth >= n) {
            this.currentHealth -= n;
        } else {
            this.currentHealth = 0;
        }
    }

    public void attack(Character c) {
        c.takeDamage(9);
    }

    @Override
    public String toString() {
        if (this.currentHealth != 0) {
            return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
        }
        
        return String.format("%s : KO", this.name);
    }
}
