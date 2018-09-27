package com.company;

public class BankAccountFacade {
    private int accountNbr;
    private int securityCode;

    AccountNumberCheck acctChecker;
    CheckSecurityCode secCodeChecker;
    FundsCheck fundChecker;
    WelcomeToBank bankWelcome;

    public BankAccountFacade(int newActNbr, int newSecCode){
        this.accountNbr = newActNbr;
        this.securityCode = newSecCode;

        bankWelcome = new WelcomeToBank();
        acctChecker = new AccountNumberCheck();
        secCodeChecker = new CheckSecurityCode();
        fundChecker = new FundsCheck();
    }

    public int getAccountNbr(){ return accountNbr; }
    public int getSecurityCode(){ return securityCode; }
    public void withDrawCash(int cashToWithdraw){
        if(acctChecker.accountActive(getAccountNbr()) &&
                secCodeChecker.isCodeCorrect(getSecurityCode()) &&
                fundChecker.haveEnoughMoney(cashToWithdraw)){
            System.out.println("Transaction Complete! ");
        }else{
             System.out.println("Transaction Failed! ");
        }
    }
    public void depositCash(int cashToDep){
        if(acctChecker.accountActive(getAccountNbr()) &&
                secCodeChecker.isCodeCorrect(getSecurityCode())){
            fundChecker.makeDeposit(cashToDep);
            System.out.println("Transaction Complete! ");
        }else{
            System.out.println("Transaction Failed! ");
        }

    }
}
