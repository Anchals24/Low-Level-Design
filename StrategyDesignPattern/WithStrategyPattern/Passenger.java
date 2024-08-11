package BehaviouralDesignPatterns.StrategyDesignPattern.WithStrategyPattern;

import BehaviouralDesignPatterns.StrategyDesignPattern.WithStrategyPattern.Strategy.DriveStrategyInterface;
import BehaviouralDesignPatterns.StrategyDesignPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class Passenger extends Vehicle{
    Passenger() {
        super(new NormalDriveStrategy());
    }
}
