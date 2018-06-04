package Chapter4_팩토리.PizzaStore.PizzaIngredientFactory;

import Chapter4_팩토리.PizzaStore.Ingredient.Cheese.Cheese;
import Chapter4_팩토리.PizzaStore.Ingredient.Clams.Clams;
import Chapter4_팩토리.PizzaStore.Ingredient.Dough.Dough;
import Chapter4_팩토리.PizzaStore.Ingredient.Pepperoni.Pepperoni;
import Chapter4_팩토리.PizzaStore.Ingredient.Sauce.Sauce;
import Chapter4_팩토리.PizzaStore.Ingredient.Veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
