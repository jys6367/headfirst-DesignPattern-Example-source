package Chapter4_팩토리.PizzaStore.Pizza.NYStyle;

import Chapter4_팩토리.PizzaStore.Pizza.Pizza;
import Chapter4_팩토리.PizzaStore.PizzaIngredientFactory.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
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
