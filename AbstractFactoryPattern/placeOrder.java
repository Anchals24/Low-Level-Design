package CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern;

public class placeOrder {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");

        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("clam");

        ChicagoPizzaStore chicagoPizzaStore1 = new ChicagoPizzaStore();
        chicagoPizzaStore1.orderPizza("mushroom");

    }
}
