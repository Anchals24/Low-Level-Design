package CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern;

import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.IngredientFactories.ChicagoIngredientFactory;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.IngredientFactories.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();

        if (pizzaType.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        else if (pizzaType.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        else if (pizzaType.equals("mushroom")){
            pizza = new MushroomPizza(ingredientFactory);
            pizza.setName("Chicago Style Mushroom Pizza.");
        }
        return pizza;
    }
}
