package BehaviouralDesignPatterns.TemplateDesignPattern;

public abstract class PaymentFlow {

    public abstract void validateRequest();
    public abstract void debitMoney();
    public abstract void calculateCharges();
    public abstract void creditMoney();

    public final void sendMoney(){
        //Template Method: Defines the order of steps to execute the task.
        //Step-1:
        System.out.println("Step-1:");
        validateRequest();
        //Step-2:
        System.out.println("Step-2:");
        debitMoney();
        //Step-3:
        System.out.println("Step-3:");
        calculateCharges();
        //Step-4:
        System.out.println("Step-4:");
        creditMoney();

    }
}
