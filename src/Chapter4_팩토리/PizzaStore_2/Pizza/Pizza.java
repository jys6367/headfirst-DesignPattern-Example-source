package Chapter4_팩토리.PizzaStore_2.Pizza;

import Chapter4_팩토리.PizzaStore.Ingredient.Cheese.Cheese;
import Chapter4_팩토리.PizzaStore.Ingredient.Clams.Clams;
import Chapter4_팩토리.PizzaStore.Ingredient.Dough.Dough;
import Chapter4_팩토리.PizzaStore.Ingredient.Pepperoni.Pepperoni;
import Chapter4_팩토리.PizzaStore.Ingredient.Sauce.Sauce;
import Chapter4_팩토리.PizzaStore.Ingredient.Veggies.Veggies;

public abstract class Pizza {
    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cuttings the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public String toString() {
//        // 피자 이름 출력;
//    }
}
