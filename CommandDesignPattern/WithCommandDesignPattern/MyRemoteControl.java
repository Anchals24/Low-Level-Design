package BehaviouralDesignPatterns.CommandDesignPattern.WithCommandDesignPattern;

import java.util.Stack;

//Invoker
public class MyRemoteControl {

    Stack<ICommand> acCommandsHistory = new Stack<>();
    ICommand command;
    MyRemoteControl(){

    }

    public void setCommand(ICommand command){
        this.command = command;

    }

    public void pressButton(){
        command.execute();
        acCommandsHistory.add(command);
    }

    public void undo(){

        if (!acCommandsHistory.isEmpty()){
            ICommand lastCommand = acCommandsHistory.pop();
            lastCommand.undo();
        }
    }
}
