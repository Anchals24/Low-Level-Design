package CreationalDesignPattern.FactoryPattern.FactoryMethodDesignPattern;

public abstract class PizzaStore {

    public Pizza orderPizza(String pizzaType){

        Pizza pizza;
        pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.pack();

        return pizza;

    }

    abstract Pizza createPizza(String pizzaType);
}
