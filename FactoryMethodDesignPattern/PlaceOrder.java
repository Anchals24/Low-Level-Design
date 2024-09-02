package CreationalDesignPattern.FactoryPattern.FactoryMethodDesignPattern;

public class PlaceOrder {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        nyPizzaStore.orderPizza("cheese");
        nyPizzaStore.orderPizza("mushroom");

        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
        chicagoPizzaStore.orderPizza("cheese");

    }
}
