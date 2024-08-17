package BehaviouralDesignPatterns.CommandDesignPattern.WithoutCommandDesignPattern;

//client is handling all of this.

public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        ac.turnOnAc();
        ac.setTemperature(30);
        ac.turnOffAc();

        Bulb b1 = new Bulb();
        b1.turnOnBulb();
        b1.turnOffBulb();
    }
}

//There are multiple problems with this kind of implementation.
// Now, at this moment. turn on ac -> simple, 100 methods runs -> AC turn on.
// Client should definitely know about the working of all of these methods -> turn on AC.
// unnecessary methods -> clients expose
// 1. Lack of Abstraction

// 2. Undo/Redo : clients sare methods ko revert padega

//3. Difficulty in the code maintenance: what if Bulb, Fan, WashingMachine ...


