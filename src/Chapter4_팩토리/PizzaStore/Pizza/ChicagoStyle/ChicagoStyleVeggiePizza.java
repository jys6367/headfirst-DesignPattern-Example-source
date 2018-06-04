package Chapter4_팩토리.PizzaStore.Pizza.ChicagoStyle;

import Chapter4_팩토리.PizzaStore.Pizza.Pizza;
import Chapter4_팩토리.PizzaStore.PizzaIngredientFactory.PizzaIngredientFactory;

public class ChicagoStyleVeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ChicagoStyleVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
