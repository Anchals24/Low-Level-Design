package CreationalDesignPattern.FactoryPattern.FactoryMethodDesignPattern;

public class ChicagoStyleCheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing ChicagoStyle  CHEESE pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Baking ChicagoStyle CHEESE pizza.");

    }

    @Override
    public void cut() {
        System.out.println("Cutting the ChicagoStyle CHEESE pizza into triangular pieces.");

    }

    @Override
    public void pack() {
        System.out.println("Packing the ChicagoStyle CHEESE pizza. It's ready to deliver :)" );

    }
}