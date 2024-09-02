package CreationalDesignPattern.FactoryPattern.FactoryMethodDesignPattern;

public class ChicagoStylePepporoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing ChicagoStyle PEPPERONI pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Baking ChicagoStyle PEPPERONI pizza.");

    }

    @Override
    public void cut() {
        System.out.println("Cutting the ChicagoStyle PEPPERONI pizza into triangular pieces.");

    }

    @Override
    public void pack() {
        System.out.println("Packing the ChicagoStyle PEPPERONI pizza. It's ready to deliver :)" );

    }
}
