package Chapter3_데코레이터.StarbuzzCoffe.Condiment;

import Chapter3_데코레이터.StarbuzzCoffe.Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
