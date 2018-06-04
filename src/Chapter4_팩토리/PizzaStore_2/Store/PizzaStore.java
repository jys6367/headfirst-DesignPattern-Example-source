package Chapter4_팩토리.PizzaStore_2.Store;

import Chapter4_팩토리.PizzaStore.Pizza.Pizza;

public abstract class PizzaStore {


    public Pizza orderPizza(String type) {
        Pizza pizza = CreatePizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza CreatePizza(String type);
}
