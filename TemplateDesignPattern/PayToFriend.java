package BehaviouralDesignPatterns.TemplateDesignPattern;

public class PayToFriend extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validating the request for to Payment to a friend.");
    }

    @Override
    public void debitMoney() {
        System.out.println("Deducting the request for to Payment to a friend.");

    }

    @Override
    public void calculateCharges() {
        System.out.println("Calculating 0% charges for to Payment to a friend.");

    }

    @Override
    public void creditMoney() {
        System.out.println("Paying the FULL AMOUNT to the friend.");

    }
}
