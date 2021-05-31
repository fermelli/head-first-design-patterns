package classes.weapon;

import interfaces.WeaponBehavior;

/**
 *
 * @author fermelli
 */
public class BowAndArrow implements WeaponBehavior {
    
    public void useWeapon() {
        System.out.println("Shooting an arrow with a bow");
    }
}
