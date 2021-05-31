package classes.character;

import classes.weapon.Sword;

/**
 *
 * @author fermelli
 */
public class King extends Character {
    
    public King() {
        weapon = new Sword();
    }

    public void fight() {
        System.out.println("The King starts the fight");
    }
}
