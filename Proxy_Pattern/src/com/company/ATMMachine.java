package com.company;

public class ATMMachine implements GetATMData {
    boolean hasCard;
    boolean noCard;
    boolean hasCorrectPin;
    boolean atmOutOfMoney;
    String atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine(){
        atmState = "This is sample ATM state";
        hasCard = true;
        noCard = false;
        hasCorrectPin = false;
        atmOutOfMoney = false;
    }
    public boolean getYesCardState() {return hasCard;}
    public boolean getNoCardState() {return noCard;}
    public boolean hasCorrectPin() {return hasCorrectPin;}
    public void setCashInMachine(int cash) {this.cashInMachine = cash;}
    public String getAtmState() {return atmState;}

    /*
        Everything above this is protected. We will only make methods below this visible.
     */
    @Override
    public String getATMData() {
        return getAtmState();
    }

    @Override
    public int getCashInMachine() {
        return cashInMachine;
    }
}
