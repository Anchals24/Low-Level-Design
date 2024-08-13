package BehaviouralDesignPatterns.ObserverDesignPattern.Observable;

import BehaviouralDesignPatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StockStatusAmazonObservable{
    //Q1: Why we are using NotificationAlertObserver
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);

    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);

    }

    @Override
    public void notifySubscribers() {
        //Q2: understand the for loop
        for (NotificationAlertObserver observer: observerList){
            observer.update();
        }

    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount = stockCount + newStockAdded;
        System.out.println(stockCount);

    }

    @Override
    public int getStockCount() {
        System.out.println(stockCount);
        return stockCount;
    }
}
