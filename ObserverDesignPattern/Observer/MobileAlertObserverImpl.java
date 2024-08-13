package BehaviouralDesignPatterns.ObserverDesignPattern.Observer;

import BehaviouralDesignPatterns.ObserverDesignPattern.Observable.StockStatusAmazonObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StockStatusAmazonObservable observable;

    public MobileAlertObserverImpl (String userName, StockStatusAmazonObservable observable){
        this.observable = observable;
        this.userName = userName;
    }

    @Override
    public void update() {
        sendSMS(userName, "Product is in stock now, so hurry up!");

    }

    public void sendSMS(String userName, String msg){
        System.out.println("SMS has been sent to the user: " + userName + " with the message: " + msg);
    }
}
