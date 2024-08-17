package BehaviouralDesignPatterns.CommandDesignPattern.WithoutCommandDesignPattern;

public class AirConditioner {
    boolean isOn;
    int temperature;


    public void turnOnAc(){
        isOn = true;
        System.out.println("AC is ON.");
    }

    public void turnOffAc(){
        isOn = false;
        System.out.println("AC is OFF.");

    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
        System.out.println("Current AC temperature is: " + temperature);
    }


}
