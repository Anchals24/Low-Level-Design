package BehaviouralDesignPatterns.CommandDesignPattern.WithCommandDesignPattern;

import BehaviouralDesignPatterns.CommandDesignPattern.WithoutCommandDesignPattern.AirConditioner;

public class TurnACOnCommandImpl implements ICommand{
    AirConditioner ac;

    TurnACOnCommandImpl(AirConditioner ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turnOnAc();
    }

    public void undo(){
        ac.turnOffAc();
    }
}
