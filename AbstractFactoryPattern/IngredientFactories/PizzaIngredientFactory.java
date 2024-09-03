package CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.IngredientFactories;

import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Cheese.Cheese;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Dough.Dough;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Pepperoni.Pepperoni;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Sauce.Sauce;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Pepperoni createPepperoni();


}
