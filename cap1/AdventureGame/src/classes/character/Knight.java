package classes.character;

import classes.weapon.Axe;

/**
 *
 * @author fermelli
 */
public class Knight extends Character {

    public Knight() {
        weapon = new Axe();
    }

    public void fight() {
        System.out.println("The Knight starts the fight");
    }
}
