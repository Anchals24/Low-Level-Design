package CreationalDesignPattern.FactoryPattern.FactoryMethodDesignPattern;

public class NYStylePizzaStore extends PizzaStore {
    @Override

    Pizza createPizza(String pizzaType) {
        Pizza pizza = null;

        if (pizzaType.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }
        else if (pizzaType.equals("pepperoni")){
            pizza = new NYStylePepporoniPizza();
        }
        else if (pizzaType.equals("mushroom")){
            pizza = new NYStyleMushroomPizza();
        }
        else{
            throw new IllegalArgumentException("Unknown Pizza Type: " + pizzaType);
        }
        return pizza;
    }
}

