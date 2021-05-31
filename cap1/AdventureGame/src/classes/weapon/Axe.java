package classes.weapon;

import interfaces.WeaponBehavior;

/**
 *
 * @author fermelli
 */
public class Axe implements WeaponBehavior {
    
    public void useWeapon() {
        System.out.println("Chopping with an axe");
    }
}
