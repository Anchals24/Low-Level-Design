package CreationalDesignPattern.FactoryPattern.FactoryMethodDesignPattern;

public class ChicagoStylePizzaStore  extends PizzaStore{

    public Pizza createPizza(String pizzaType){
        Pizza pizza = null;

        if (pizzaType.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }
        else if (pizzaType.equals("pepperoni")){
            pizza = new ChicagoStylePepporoniPizza();
        }
        else if (pizzaType.equals("mushroom")){
            pizza = new ChicagoStyleMushroomPizza();
        }
        else{
            throw new IllegalArgumentException("Unknown Pizza Type: " + pizzaType);
        }
        return pizza;
    }
}
