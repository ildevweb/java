package AdventureCatch;

public class Sorcerer extends Character implements Healer {
    Integer healCapacity;
    
    public Sorcerer(String name, Integer maxHealth, Integer healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
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
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP. He has the weapon %s", this.name, this.healCapacity, this.weapon.toString());
        }
        
        return String.format("%s is a sorcerer with %d HP. It can heal %d HP. He has the weapon %s", this.name, this.currentHealth, this.healCapacity, this.weapon.toString());
    }


    @Override
    void takeDamage(int n) throws DeadCharacterException {
        if (this.currentHealth <= 0) {
            throw new DeadCharacterException(this);
        }

        if (this.currentHealth >= n) {
            this.currentHealth -= n;
        } else {
            this.currentHealth = 0;
        }
    }

    @Override
    void attack(Character c) throws DeadCharacterException {
        if (this.currentHealth <= 0) {
            throw new DeadCharacterException(this);
        }
        
        this.heal(this);
        if (this.weapon == null) {
            try {
                this.takeDamage(10);
            } catch (DeadCharacterException e) {
                System.out.println(e.getMessage());
            }
        } else {
            try {
                c.takeDamage(this.weapon.getDamage());
            } catch (DeadCharacterException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}