package classes.condiment;

import classes.Beverage;

/**
 *
 * @author fermelli
 */
public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public abstract String getDescription();
}
