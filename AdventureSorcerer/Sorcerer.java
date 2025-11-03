package AdventureSorcerer;

public class Sorcerer extends Character implements Healer {
    Integer healCapacity;
    
    public Sorcerer(String name, Integer maxHealth, Integer healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    public Integer getHealCapacity() {
        return healCapacity;
    }

    public void heal(Character c) {
        if (c.currentHealth < c.maxHealth) {
            c.currentHealth += healCapacity;
        }
    }

    @Override
    public String toString() {
        if (this.currentHealth == 0) {
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", this.name, this.healCapacity);
        }
        
        return String.format("%s is a sorcerer with %d HP. It can heal %d HP.", this.name, this.currentHealth, this.healCapacity);
    }
}
