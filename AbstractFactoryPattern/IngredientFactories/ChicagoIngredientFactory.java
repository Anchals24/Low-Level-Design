package CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.IngredientFactories;

import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Cheese.Cheese;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Cheese.MozzarellaCheese;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Dough.Dough;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Dough.ThickCrustDough;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Pepperoni.Pepperoni;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Pepperoni.SlicedPepperoni;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Sauce.PlumTomatoSauce;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Sauce.Sauce;

public class ChicagoIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

}
