package CreationalDesignPattern.FactoryPattern.SimpleFactoryPattern.WithSimpleFactoryPattern;

//It has only 1 job in life i.e. to CREATE PIZZAS for the clients.

public class SimplePizzaFactory {

    //Define a createPizza() method in the factory. This is the method all clients will use to instantiate new objects.

    public Pizza createPizza(String pizzaType){
        Pizza pizza = null;

        if (pizzaType.equals("cheese")){
            pizza = new CheesePizza();
        }
        else if (pizzaType.equals("pepperoni")){
            pizza = new PepporoniPizza();
        }
        else if (pizzaType.equals("mushroom")){
            pizza = new MushroomPizza();
        }
        else{
            throw new IllegalArgumentException("Unknown Pizza Type: " + pizzaType);
        }
        return pizza;
    }
}
