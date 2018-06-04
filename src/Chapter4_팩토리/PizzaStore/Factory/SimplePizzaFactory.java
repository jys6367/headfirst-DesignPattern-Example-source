package Chapter4_팩토리.PizzaStore.Factory;

import Chapter4_팩토리.PizzaStore.Pizza.Basic.CheesePizza;
import Chapter4_팩토리.PizzaStore.Pizza.Basic.PepperoniPizza;
import Chapter4_팩토리.PizzaStore.Pizza.Pizza;
import Chapter4_팩토리.PizzaStore.Pizza.Basic.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
