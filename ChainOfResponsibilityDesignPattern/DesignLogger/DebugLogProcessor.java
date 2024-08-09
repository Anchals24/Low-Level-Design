package BehaviouralDesignPatterns.ChainOfResponsibilityDesignPattern.DesignLogger;

public class DebugLogProcessor extends LogProcessor{
    //constructor of this class, which will call the constructor of super class. next logger -> as parameter
    public DebugLogProcessor(LogProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    public void log(int logLevel, String message){
        if (logLevel == DEBUG){
            System.out.println("DEBUG: " + message);
        }
        else{
            super.log(logLevel, message);
        }
    }
}
