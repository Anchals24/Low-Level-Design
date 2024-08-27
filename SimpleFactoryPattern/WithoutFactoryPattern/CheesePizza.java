package CreationalDesignPattern.FactoryPattern.SimpleFactoryPattern.WithoutFactoryPattern;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing CHEESE pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Baking CHEESE pizza.");

    }

    @Override
    public void cut() {
        System.out.println("Cutting the CHEESE pizza into triangular pieces.");

    }

    @Override
    public void pack() {
        System.out.println("Packing the CHEESE pizza. It's ready to deliver :)" );

    }
}
