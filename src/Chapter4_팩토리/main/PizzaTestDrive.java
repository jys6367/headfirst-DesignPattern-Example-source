package Chapter4_팩토리.main;

import Chapter4_팩토리.PizzaStore.Pizza.Pizza;
import Chapter4_팩토리.PizzaStore.Store.ChicagoPizzaStore;
import Chapter4_팩토리.PizzaStore.Store.NYPizzaStore;
import Chapter4_팩토리.PizzaStore.Store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore ChicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = ChicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
