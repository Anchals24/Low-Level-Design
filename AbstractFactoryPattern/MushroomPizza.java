package CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern;

import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.IngredientFactories.PizzaIngredientFactory;

public class MushroomPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;
    public MushroomPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;

    }
    @Override
    void prepare() {

        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();

    }
}
