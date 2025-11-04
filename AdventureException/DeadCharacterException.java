package AdventureException;

public class DeadCharacterException extends Exception {
    Character c;
    
    public DeadCharacterException(Character c) {
        this.c = c;
    }

    public String getMessage() {
        //return String.format("The <sorcerer | monster | templar> %s is dead.", this.c.name);

        if (this.c instanceof Sorcerer) {
            return String.format("The sorcerer %s is dead.", this.c.name);
        } else if (this.c instanceof Templar) {
            return String.format("The templar %s is dead.", this.c.name);
        } 
        
        return String.format("The monster %s is dead.", this.c.name);
    }
}
