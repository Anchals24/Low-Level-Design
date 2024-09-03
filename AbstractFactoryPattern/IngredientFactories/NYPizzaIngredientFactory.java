package CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.IngredientFactories;

import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Cheese.Cheese;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Cheese.ReggianoCheese;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Dough.Dough;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Dough.ThinCrustDough;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Pepperoni.Pepperoni;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Pepperoni.SlicedPepperoni;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Sauce.MarinaraSauce;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Sauce.Sauce;

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
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

}
