package classes.quack;

import interfaces.QuackBehavior;

/**
 *
 * @author fermelli
 */
public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< Silence >>");
    }
}
