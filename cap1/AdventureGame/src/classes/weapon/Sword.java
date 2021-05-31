package classes.weapon;

import interfaces.WeaponBehavior;

/**
 *
 * @author fermelli
 */
public class Sword implements WeaponBehavior {

    public void useWeapon() {
        System.out.println("Swinging a sword");
    }
}
