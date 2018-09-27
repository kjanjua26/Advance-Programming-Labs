package com.company;

public class AccountNumberCheck {
    private int accountNbr = 12345678;

    public int getAccountNbr() {
        return accountNbr;
    }
    public boolean accountActive(int actNbrCheck){
        if(actNbrCheck == getAccountNbr()){
            return true;
        }else{
            return false;
        }
    }
}
