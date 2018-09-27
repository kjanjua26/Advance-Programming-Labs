package com.company;

public class CheckSecurityCode {
    private int securityCode = 1234;
    public int secCodeCheck(){ return securityCode; }
    public boolean isCodeCorrect(int secCodeCheck){
        if(secCodeCheck == secCodeCheck()){
            return true;
        }else{
            return false;
        }
    }

}

