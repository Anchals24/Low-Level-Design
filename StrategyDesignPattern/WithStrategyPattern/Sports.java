package BehaviouralDesignPatterns.StrategyDesignPattern.WithStrategyPattern;

import BehaviouralDesignPatterns.StrategyDesignPattern.WithStrategyPattern.Strategy.DriveStrategyInterface;
import BehaviouralDesignPatterns.StrategyDesignPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class Sports extends Vehicle{
    Sports( ) {
        super(new SportsDriveStrategy());
    }
}
