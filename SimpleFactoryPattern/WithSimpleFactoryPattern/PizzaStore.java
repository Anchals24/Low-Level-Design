package CreationalDesignPattern.FactoryPattern.SimpleFactoryPattern.WithSimpleFactoryPattern;

public class PizzaStore {

    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String pizzaType){
        Pizza pizza;

        pizza = factory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.pack();

        return pizza;

    }
    //other methods

    public static void main(String[] args) {
        SimplePizzaFactory factory1 = new SimplePizzaFactory();
        PizzaStore order1 = new PizzaStore(factory1);
        order1.orderPizza("cheese");
        PizzaStore order2 = new PizzaStore(factory1);
        order2.orderPizza("pepperoni");
    }
}
