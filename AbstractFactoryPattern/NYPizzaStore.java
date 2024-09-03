package CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern;

import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.IngredientFactories.NYPizzaIngredientFactory;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.IngredientFactories.PizzaIngredientFactory;

public class NYPizzaStore  extends PizzaStore{
    @Override
    Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (pizzaType.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if (pizzaType.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        else if (pizzaType.equals("mushroom")){
            pizza = new MushroomPizza(ingredientFactory);
            pizza.setName("New York Style Mushroom Pizza.");
        }
        return pizza;

    }
}
