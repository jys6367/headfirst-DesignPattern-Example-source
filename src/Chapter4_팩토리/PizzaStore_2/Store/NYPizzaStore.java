package Chapter4_팩토리.PizzaStore_2.Store;

import Chapter4_팩토리.PizzaStore.Pizza.Basic.CheesePizza;
import Chapter4_팩토리.PizzaStore.Pizza.Basic.ClamPizza;
import Chapter4_팩토리.PizzaStore.Pizza.Basic.PepperoniPizza;
import Chapter4_팩토리.PizzaStore.Pizza.Basic.VeggiePizza;
import Chapter4_팩토리.PizzaStore.Pizza.Pizza;
import Chapter4_팩토리.PizzaStore_2.PizzaIngredientFactory.NYPizzaIngredientFactory;
import Chapter4_팩토리.PizzaStore_2.PizzaIngredientFactory.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza CreatePizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New york Style Cheese Pizza");
        } else if (type.equals("greek")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New york Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New york Style Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New york Style Cheese Pizza");
        }

        return pizza;
    }
}
