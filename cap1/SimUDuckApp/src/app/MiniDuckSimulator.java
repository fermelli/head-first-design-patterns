package app;

import classes.duck.Duck;
import classes.duck.MallardDuck;
import classes.duck.ModelDuck;
import classes.fly.FlyRocketPowered;

/**
 *
 * @author fermelli
 */
public class MiniDuckSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
