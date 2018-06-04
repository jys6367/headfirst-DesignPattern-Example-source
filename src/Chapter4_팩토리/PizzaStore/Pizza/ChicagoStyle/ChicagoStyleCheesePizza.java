package Chapter4_팩토리.PizzaStore.Pizza.ChicagoStyle;

import Chapter4_팩토리.PizzaStore.Pizza.Pizza;
import Chapter4_팩토리.PizzaStore.PizzaIngredientFactory.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
