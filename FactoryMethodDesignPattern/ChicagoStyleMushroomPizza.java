package CreationalDesignPattern.FactoryPattern.FactoryMethodDesignPattern;

public class ChicagoStyleMushroomPizza implements Pizza{

    public void prepare() {
        System.out.println("Preparing Chicago Style MUSHROOM pizza.");

    }

    @Override
    public void bake() {
        System.out.println("Baking Chicago Style MUSHROOM pizza.");

    }

    @Override
    public void cut() {
        System.out.println("Cutting the Chicago Style MUSHROOM pizza into triangular pieces.");

    }

    @Override
    public void pack() {
        System.out.println("Packing the Chicago Style MUSHROOM pizza. It's ready to deliver :)" );

    }
}
