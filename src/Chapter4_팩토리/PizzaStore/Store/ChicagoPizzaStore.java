package Chapter4_팩토리.PizzaStore.Store;

import Chapter4_팩토리.PizzaStore.Pizza.ChicagoStyle.ChicagoStyleCheesePizza;
import Chapter4_팩토리.PizzaStore.Pizza.ChicagoStyle.ChicagoStyleClamPizza;
import Chapter4_팩토리.PizzaStore.Pizza.ChicagoStyle.ChicagoStylePepperoniPizza;
import Chapter4_팩토리.PizzaStore.Pizza.ChicagoStyle.ChicagoStyleVeggiePizza;
import Chapter4_팩토리.PizzaStore.Pizza.NYStyle.NYStyleCheesePizza;
import Chapter4_팩토리.PizzaStore.Pizza.NYStyle.NYStyleClamPizza;
import Chapter4_팩토리.PizzaStore.Pizza.NYStyle.NYStylePepperoniPizza;
import Chapter4_팩토리.PizzaStore.Pizza.NYStyle.NYStyleVeggiePizza;
import Chapter4_팩토리.PizzaStore.Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza CreatePizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("greek")) {
            return new ChicagoStylePepperoniPizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else return null;
    }
}
