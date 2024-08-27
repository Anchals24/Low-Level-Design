package CreationalDesignPattern.FactoryPattern.SimpleFactoryPattern.WithoutFactoryPattern;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing GREEK pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Baking GREEK pizza.");

    }

    @Override
    public void cut() {
        System.out.println("Cutting the GREEK pizza into triangular pieces.");

    }

    @Override
    public void pack() {
        System.out.println("Packing the GREEK pizza. It's ready to deliver :)" );

    }
}
