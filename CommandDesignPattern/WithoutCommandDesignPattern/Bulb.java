package BehaviouralDesignPatterns.CommandDesignPattern.WithoutCommandDesignPattern;

public class Bulb {
    boolean isOn;

    public void turnOnBulb(){
        isOn = true;
        System.out.println("Bulb is ON now");
    }

    public void turnOffBulb(){
        isOn = false;
        System.out.println("Bulb is OFF now");
    }
}
