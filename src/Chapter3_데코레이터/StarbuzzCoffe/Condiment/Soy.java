package Chapter3_데코레이터.StarbuzzCoffe.Condiment;

import Chapter3_데코레이터.StarbuzzCoffe.Beverage.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
