package CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Pepperoni;

public class SlicedPepperoni implements Pepperoni{
    public SlicedPepperoni() {
        System.out.println("Using Sliced Pepperoni");
    }

    public String toString() {
        return "Sliced Pepperoni";
    }
}
