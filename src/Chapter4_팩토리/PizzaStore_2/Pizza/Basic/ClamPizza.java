package Chapter4_팩토리.PizzaStore_2.Pizza.Basic;

import Chapter4_팩토리.PizzaStore.PizzaIngredientFactory.PizzaIngredientFactory;
import Chapter4_팩토리.PizzaStore_2.Pizza.Pizza;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
