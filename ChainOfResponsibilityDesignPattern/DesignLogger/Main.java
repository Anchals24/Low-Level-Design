package BehaviouralDesignPatterns.ChainOfResponsibilityDesignPattern.DesignLogger;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logObject.log(1, "This is a INFO logger.");
        logObject.log(2, "This is a DEBUG logger.");
        logObject.log(3, "This is an ERROR logger");
        logObject.log(6, "Does not exist");

        
    }
}
