package BehaviouralDesignPatterns.StrategyDesignPattern.WithoutStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new PassengerVehicle();
        vehicle1.drive();
        Vehicle vehicle2 = new SportsVehicle();
        vehicle2.drive();
        Vehicle vehicle3 = new OffloadVehicle();
        vehicle3.drive();
    }
}
