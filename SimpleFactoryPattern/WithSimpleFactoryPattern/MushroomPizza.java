package CreationalDesignPattern.FactoryPattern.SimpleFactoryPattern.WithSimpleFactoryPattern;

public class MushroomPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing MUSHROOM pizza.");

    }

    @Override
    public void bake() {
        System.out.println("Baking MUSHROOM pizza.");

    }

    @Override
    public void cut() {
        System.out.println("Cutting the MUSHROOM pizza into triangular pieces.");

    }

    @Override
    public void pack() {
        System.out.println("Packing the MUSHROOM pizza. It's ready to deliver :)" );

    }
}
