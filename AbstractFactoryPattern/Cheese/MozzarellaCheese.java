package CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Cheese;

public class MozzarellaCheese implements Cheese {
    public MozzarellaCheese() {
        System.out.println("Using Mozzarella Cheese");
    }
    public String toString() {
        System.out.println("Using Mozzarella Cheese");
        return "MozzarellaCheese Cheese";
    }
}
