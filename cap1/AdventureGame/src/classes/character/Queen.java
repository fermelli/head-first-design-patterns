package classes.character;

import classes.weapon.Knife;

/**
 *
 * @author fermelli
 */
public class Queen extends Character {
    
    public Queen() {
        weapon = new Knife();
    }

    public void fight() {
        System.out.println("The Queen starts the fight");
    }
}
