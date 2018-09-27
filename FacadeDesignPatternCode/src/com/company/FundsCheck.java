package com.company;

public class FundsCheck {
    private int cashInAccount = 1000;
    public int getCashInAccount(){return cashInAccount; }
    public void decreaseCashInAccount(double cashWithdrawn){
        cashInAccount -= cashWithdrawn;
    }
    public void increaseCashInAccount(double cashDep){
        cashInAccount += cashDep;
    }

    public boolean haveEnoughMoney(double cashToWithdraw){
        if(cashToWithdraw > getCashInAccount()){
            System.out.println("Error: You donot have enough money!");
            System.out.println("Current balance: " + getCashInAccount());
            return false;
        }else{
            decreaseCashInAccount(cashToWithdraw);
            System.out.println("Withdrawal Complete: Current balance: " + getCashInAccount());
            return true;
        }
    }
    public void makeDeposit(double cashToDep){
        increaseCashInAccount(cashToDep);
        System.out.println("Deposit Complete: Current balance: " + getCashInAccount());

    }
}