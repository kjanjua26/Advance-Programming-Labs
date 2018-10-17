package com.company;

import java.util.ArrayList;
public class StockGrabber implements Subject {
    ArrayList<Observer> observers;
    private double ibmPrice, aaplPrice, googPrice;

    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer: " + (observerIndex+1)+ " deleted");
        observers.remove(observerIndex);
    }
    public void notifyObserver() {
        for(Observer obj: observers)
            obj.update(ibmPrice, aaplPrice, googPrice);
    }
    public void setIbmPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }
    public void setAaplPrice(double newAaplPrice){
        this.aaplPrice = newAaplPrice;
        notifyObserver();
    }
    public void setGoogPrice(double newGoogPrice){
        this.googPrice = newGoogPrice;
        notifyObserver();
    }
}
