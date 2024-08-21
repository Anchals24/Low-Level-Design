package BehaviouralDesignPatterns.ChainOfResponsibilityDesignPattern.DesignLogger;


public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    public void log(int logLevel, String message){
        if (logLevel == ERROR){
            System.out.println("ERROR: " + message);
        }
        else{
            super.log(logLevel, message);
        }
    }
}
