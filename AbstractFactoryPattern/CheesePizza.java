package CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern;

import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.IngredientFactories.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();

    }
}
