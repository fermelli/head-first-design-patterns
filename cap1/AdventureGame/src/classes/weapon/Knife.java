package classes.weapon;

import interfaces.WeaponBehavior;

/**
 *
 * @author fermelli
 */
public class Knife implements WeaponBehavior {

    public void useWeapon() {
        System.out.println("Cutting with a knife");
    }
}
