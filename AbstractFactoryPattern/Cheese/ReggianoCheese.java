package CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Cheese;

public class ReggianoCheese implements Cheese {
    public ReggianoCheese() {
        System.out.println("Using Reggiano Cheese");
    }
    public String toString() {
        System.out.println("Using Reggiano Cheese");
        return "Reggiano Cheese";
    }

}
