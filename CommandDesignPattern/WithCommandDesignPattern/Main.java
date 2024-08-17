package BehaviouralDesignPatterns.CommandDesignPattern.WithCommandDesignPattern;

//User/Client

import BehaviouralDesignPatterns.CommandDesignPattern.WithoutCommandDesignPattern.AirConditioner;

public class Main {
    public static void main(String[] args) {
        //AC Object

        AirConditioner AC = new AirConditioner();


        //RemoteControl

        MyRemoteControl remoteObj = new MyRemoteControl();

        //create the command & press the button
        remoteObj.setCommand(new TurnACOnCommandImpl(AC));

        //users job is just to press the button.

        remoteObj.pressButton();

        //undo the command

        remoteObj.undo();

    }


}
