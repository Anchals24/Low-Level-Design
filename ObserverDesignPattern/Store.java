package BehaviouralDesignPatterns.ObserverDesignPattern;

import BehaviouralDesignPatterns.ObserverDesignPattern.Observable.IphoneStockObservableImpl;
import BehaviouralDesignPatterns.ObserverDesignPattern.Observable.StockStatusAmazonObservable;
import BehaviouralDesignPatterns.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import BehaviouralDesignPatterns.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import BehaviouralDesignPatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {

        StockStatusAmazonObservable iphoneStockObservable = new IphoneStockObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("ancss12@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("Anchal", iphoneStockObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("ikshit701@gmail.com", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);
        iphoneStockObservable.getStockCount();
        iphoneStockObservable.setStockCount(20);
        iphoneStockObservable.getStockCount();
        iphoneStockObservable.setStockCount(-20);




    }
}
