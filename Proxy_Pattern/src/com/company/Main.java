package com.company;

public class Main {

    public static void main(String[] args) {
        GetATMData realATM = new ATMMachine();
        GetATMData ATMProxy = new ATMProxy();

        System.out.println("Current ATM State: " + ATMProxy.getATMData());
        System.out.println("Current Cash in ATM: " + ATMProxy.getCashInMachine());
        /*
            Things not possible because of limitation by the interface:
            realATM.hasCorrectPin().
         */
    }
}
