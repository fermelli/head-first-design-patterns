package classes.character;

import classes.weapon.BowAndArrow;

/**
 *
 * @author fermelli
 */
public class Troll extends Character {
    
    public Troll() {
        weapon = new BowAndArrow();
    }

    public void fight() {
        System.out.println("The Knight starts the fight");
    }
}
