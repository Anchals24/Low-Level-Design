package CreationalDesignPattern.FactoryPattern.FactoryMethodDesignPattern;


public class NYStylePepporoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing NYStyle PEPPERONI pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Baking NYStyle PEPPERONI pizza.");

    }

    @Override
    public void cut() {
        System.out.println("Cutting the NYStyle PEPPERONI pizza into triangular pieces.");

    }

    @Override
    public void pack() {
        System.out.println("Packing the NYStyle PEPPERONI pizza. It's ready to deliver :)" );

    }
}
