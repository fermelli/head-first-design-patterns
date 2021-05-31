package app;

import classes.duck.Duck;
import classes.duck.MallardDuck;

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
    }

}
