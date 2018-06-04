package Chapter4_팩토리.PizzaStore_2.PizzaIngredientFactory;

import Chapter4_팩토리.PizzaStore_2.Ingredient.Cheese.Cheese;
import Chapter4_팩토리.PizzaStore_2.Ingredient.Cheese.ReggianoCheese;
import Chapter4_팩토리.PizzaStore_2.Ingredient.Clams.Clams;
import Chapter4_팩토리.PizzaStore_2.Ingredient.Clams.FreshClams;
import Chapter4_팩토리.PizzaStore_2.Ingredient.Dough.Dough;
import Chapter4_팩토리.PizzaStore_2.Ingredient.Dough.ThinCrustDough;
import Chapter4_팩토리.PizzaStore_2.Ingredient.Pepperoni.Pepperoni;
import Chapter4_팩토리.PizzaStore_2.Ingredient.Pepperoni.SlicedPepperoni;
import Chapter4_팩토리.PizzaStore_2.Ingredient.Sauce.MarinaraSauce;
import Chapter4_팩토리.PizzaStore_2.Ingredient.Sauce.Sauce;
import Chapter4_팩토리.PizzaStore_2.Ingredient.Veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
