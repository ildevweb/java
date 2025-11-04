package AdventureCatch;

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
    void takeDamage(int n) throws DeadCharacterException {
        if (this.currentHealth <= 0) {
            throw new DeadCharacterException(this);
        }
        int reducedDamage = (int) Math.floor(n * 0.8);

        if (this.currentHealth >= reducedDamage) {
            this.currentHealth -= reducedDamage;
        } else {
            this.currentHealth = 0;
        }
    }

    @Override
    void attack(Character c) throws DeadCharacterException {
        if (this.currentHealth <= 0) {
            throw new DeadCharacterException(this);
        }

        if (this.weapon == null) {
            try {
                c.takeDamage(7);
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