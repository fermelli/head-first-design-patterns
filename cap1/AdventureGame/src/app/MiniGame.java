package app;

import classes.character.Character;
import classes.character.King;
import classes.weapon.Axe;

/**
 *
 * @author fermelli
 */
public class MiniGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Character king = new King();
        king.fight();
        king.useWeapon();
        king.setWeapon(new Axe());
        king.useWeapon();
    }

}
