package classes.character;

import interfaces.WeaponBehavior;

/**
 *
 * @author fermelli
 */
public abstract class Character {

    WeaponBehavior weapon;

    public Character() {
    }

    public abstract void fight();
    
    public void useWeapon() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior w) {
        weapon = w;
    }
}
