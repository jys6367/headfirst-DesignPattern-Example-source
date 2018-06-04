package Chapter4_팩토리.PizzaStore_2.PizzaIngredientFactory;

import Chapter4_팩토리.PizzaStore_2.Ingredient.Cheese.Cheese;
import Chapter4_팩토리.PizzaStore_2.Ingredient.Clams.Clams;
import Chapter4_팩토리.PizzaStore_2.Ingredient.Dough.Dough;
import Chapter4_팩토리.PizzaStore_2.Ingredient.Pepperoni.Pepperoni;
import Chapter4_팩토리.PizzaStore_2.Ingredient.Sauce.Sauce;
import Chapter4_팩토리.PizzaStore_2.Ingredient.Veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
