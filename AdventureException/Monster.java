package AdventureException;

public class Monster extends Character {

    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }


    @Override
    public String toString() {
        if (this.currentHealth == 0) {
            return String.format("%s is a monster and is dead. He has the weapon %s", this.name, this.weapon.toString());
        }

        return String.format("%s is a monster with %d HP. He has the weapon %s", this.name, this.currentHealth, this.weapon.toString());
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
        if (this.weapon == null) {
            c.takeDamage(7);
        } else {
            c.takeDamage(this.weapon.getDamage());
        }
    }
}