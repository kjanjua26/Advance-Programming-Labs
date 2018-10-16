package com.company;

public class Animal {
    public Flys flyingType;
    public String tryToFly(){
        return flyingType.fly();
    }
    public void setType(Flys SetingflyType){
        flyingType = SetingflyType;
    }
}
