package BehaviouralDesignPatterns.StrategyDesignPattern.WithStrategyPattern;

import BehaviouralDesignPatterns.StrategyDesignPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffloadVehicle extends Vehicle {

    OffloadVehicle(){
        super (new SportsDriveStrategy());
    }

}
