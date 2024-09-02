package CreationalDesignPattern.FactoryPattern.FactoryMethodDesignPattern;


public class NYStyleMushroomPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing NY Style MUSHROOM pizza.");

    }

    @Override
    public void bake() {
        System.out.println("Baking NY Style MUSHROOM pizza.");

    }

    @Override
    public void cut() {
        System.out.println("Cutting the NY Style MUSHROOM pizza into triangular pieces.");

    }

    @Override
    public void pack() {
        System.out.println("Packing the NY Style MUSHROOM pizza. It's ready to deliver :)" );

    }
}