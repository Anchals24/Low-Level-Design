package BehaviouralDesignPatterns.TemplateDesignPattern;

public class PayToMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validating the request for to Payment to a Merchant.");
    }

    @Override
    public void debitMoney() {
        System.out.println("Deducting the request for to Payment to a Merchant.");

    }

    @Override
    public void calculateCharges() {
        System.out.println("Calculating 5% charges for to Payment to the Merchant.");

    }

    @Override
    public void creditMoney() {
        System.out.println("Paying the REMAINING AMOUNT AFTER DEDUCTION to the MERCHANT.");

    }
}
