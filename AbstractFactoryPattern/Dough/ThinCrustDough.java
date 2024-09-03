package CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Dough;


public class ThinCrustDough implements Dough {
    public ThinCrustDough() {
        System.out.println("Using Thin Crust Dough");
    }
    public String toString() {
        return "Thin Crust Dough";
    }
}
