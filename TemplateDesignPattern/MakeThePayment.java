package BehaviouralDesignPatterns.TemplateDesignPattern;

public class MakeThePayment {
    public static void main(String[] args) {
        PaymentFlow paymentFlow = new PayToFriend();
        paymentFlow.sendMoney();

        PaymentFlow paymentFlow1 = new PayToMerchant();
        paymentFlow1.sendMoney();
    }

}
