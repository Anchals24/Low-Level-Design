package BehaviouralDesignPatterns.StrategyDesignPattern.WithoutStrategyPattern;

public class OffloadVehicle extends Vehicle{
    @Override
    public void drive(){
        //It has its special method & different drive logic
        System.out.println("Sports Drive Capability");
    }
}
