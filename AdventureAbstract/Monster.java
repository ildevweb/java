package AdventureAbstract;

public class Monster extends Character {

    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }


    @Override
    public String toString() {
        if (this.currentHealth == 0) {
            return String.format("%s is a monster and is dead", this.name);
        }

        return String.format("%s is a monster with %d HP", this.name, this.currentHealth);
    }

    @Override
    void takeDamage(int n) {
        int reducedDamage = (int) Math.floor(n * 0.8);

        if (this.currentHealth >= reducedDamage) {
            this.currentHealth -= reducedDamage;
        } else {
            this.currentHealth = 0;
        }
    }

    @Override
    void attack(Character c) {
        c.takeDamage(7);
    }
}