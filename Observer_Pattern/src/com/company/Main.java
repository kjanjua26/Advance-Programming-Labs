package com.company;

public class Main {
    public static void main(String[] args){
       try {
           StockGrabber stockGrabber = new StockGrabber();
           StockObserver observer1 = new StockObserver(stockGrabber);
           stockGrabber.setIbmPrice(197.00);
           stockGrabber.setAaplPrice(677.60);
           stockGrabber.setGoogPrice(676.40);
       }catch (Exception e){
           System.out.println(e);
       }
    }
}
