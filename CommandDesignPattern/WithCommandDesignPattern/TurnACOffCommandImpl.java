package BehaviouralDesignPatterns.CommandDesignPattern.WithCommandDesignPattern;

import BehaviouralDesignPatterns.CommandDesignPattern.WithoutCommandDesignPattern.AirConditioner;

public class TurnACOffCommandImpl implements ICommand{
    AirConditioner ac;
    TurnACOffCommandImpl(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOffAc();
    }

    public void undo(){
        ac.turnOnAc();
    }
}
