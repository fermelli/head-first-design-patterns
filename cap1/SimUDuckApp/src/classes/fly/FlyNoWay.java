package classes.fly;

import interfaces.FlyBehavior;

/**
 *
 * @author fermelli
 */
public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("I can't fly");
    }
}
