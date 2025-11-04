package AdventureCatch;

public class Templar extends Character implements Healer, Tank {
    final Integer healCapacity;
    final Integer shield;


    public Templar(String name, Integer maxHealth, Integer healCapacity, Integer shield, Weapon weapon) {
        super(name, maxHealth, weapon);
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
            return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP. He has the weapon %s", this.name, this.shield, this.healCapacity, this.weapon.toString());
        }

        return String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d. He has the weapon %s", this.name, this.currentHealth, this.healCapacity, this.shield, this.weapon.toString());
    }


    @Override
    void takeDamage(int n) throws DeadCharacterException {
        if (this.currentHealth <= 0) {
            throw new DeadCharacterException(this);
        }

        if (this.currentHealth >= n-this.shield) {
            this.currentHealth -= n-this.shield;
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
                c.takeDamage(6);
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