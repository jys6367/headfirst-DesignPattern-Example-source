package Chapter3_데코레이터.StarbuzzCoffe.Condiment;

import Chapter3_데코레이터.StarbuzzCoffe.Beverage.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑 크림";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
