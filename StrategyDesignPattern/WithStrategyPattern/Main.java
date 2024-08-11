package BehaviouralDesignPatterns.StrategyDesignPattern.WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new OffloadVehicle();
        vehicle1.drive();
        Vehicle vehicle2 = new Passenger();
        vehicle2.drive();

    }
}
