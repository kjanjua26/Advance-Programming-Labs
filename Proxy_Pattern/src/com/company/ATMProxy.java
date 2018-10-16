package com.company;

public class ATMProxy implements GetATMData {

    @Override
    public String getATMData() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getATMData();
    }

    @Override
    public int getCashInMachine() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getCashInMachine();
    }
}
