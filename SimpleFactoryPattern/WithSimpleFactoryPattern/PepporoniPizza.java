package CreationalDesignPattern.FactoryPattern.SimpleFactoryPattern.WithSimpleFactoryPattern;

public class PepporoniPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing PEPPERONI pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Baking PEPPERONI pizza.");

    }

    @Override
    public void cut() {
        System.out.println("Cutting the PEPPERONI pizza into triangular pieces.");

    }

    @Override
    public void pack() {
        System.out.println("Packing the PEPPERONI pizza. It's ready to deliver :)" );

    }
}
