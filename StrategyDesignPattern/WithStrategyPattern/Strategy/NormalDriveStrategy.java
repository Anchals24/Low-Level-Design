package BehaviouralDesignPatterns.StrategyDesignPattern.WithStrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategyInterface {
    @Override
    public void drive() {
        System.out.println("Normal drive Capability");
    }

}
