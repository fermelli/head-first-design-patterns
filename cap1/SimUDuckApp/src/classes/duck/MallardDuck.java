package classes.duck;

import classes.fly.FlyWithWings;
import classes.quack.Quack;

/**
 *
 * @author fermelli
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
