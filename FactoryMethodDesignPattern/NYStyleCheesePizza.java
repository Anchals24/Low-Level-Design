package CreationalDesignPattern.FactoryPattern.FactoryMethodDesignPattern;

public class NYStyleCheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing NY style CHEESE pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Baking NY style CHEESE pizza.");

    }

    @Override
    public void cut() {
        System.out.println("Cutting the NY style CHEESE pizza into triangular pieces.");

    }

    @Override
    public void pack() {
        System.out.println("Packing the NY style CHEESE pizza. It's ready to deliver :)" );

    }
}