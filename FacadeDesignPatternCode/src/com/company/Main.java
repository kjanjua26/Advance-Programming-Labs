package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
        accessingBank.withDrawCash(50);
        accessingBank.withDrawCash(900);
        accessingBank.depositCash(50);
    }
}
