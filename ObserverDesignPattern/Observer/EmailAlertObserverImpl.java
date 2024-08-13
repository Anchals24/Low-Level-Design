package BehaviouralDesignPatterns.ObserverDesignPattern.Observer;

import BehaviouralDesignPatterns.ObserverDesignPattern.Observable.StockStatusAmazonObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockStatusAmazonObservable observable;

    public EmailAlertObserverImpl(String emailId, StockStatusAmazonObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMail(emailId , "Product is in stock now, so hurry up!");

    }

    public void sendMail(String emailId, String msg){
        System.out.println("Email sent to: " +  emailId + " with the message " + msg);
    }
}
