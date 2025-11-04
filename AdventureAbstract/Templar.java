package AdventureAbstract;


public class Templar extends Character implements Healer, Tank {
    final Integer healCapacity;
    final Integer shield;


    public Templar(String name, Integer maxHealth, Integer healCapacity, Integer shield) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    public Integer getHealCapacity() {
        return this.healCapacity;
    }

    public void heal(Character c) {
        if (c.currentHealth < c.maxHealth) {
            c.currentHealth += healCapacity;
        }
    }

    public Integer getShield() {
        return this.shield;
    }


    @Override
    public String toString() {
        if (this.currentHealth == 0) {
            return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.", this.name, this.shield, this.healCapacity);
        }

        return String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.", this.name, this.currentHealth, this.healCapacity, this.shield);
    }


    @Override
    void takeDamage(int n) {

        if (this.currentHealth >= n-this.shield) {
            this.currentHealth -= n-this.shield;
        } else {
            this.currentHealth = 0;
        }
    }

    @Override
    void attack(Character c) {
        this.heal(this);
        c.takeDamage(6);
    }
}
