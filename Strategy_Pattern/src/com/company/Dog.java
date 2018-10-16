package com.company;

public class Dog extends Animal{
    public Dog(){
        super(); // super class constructor
        flyingType = new CantFly();
    }
}
