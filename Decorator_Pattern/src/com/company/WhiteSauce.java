package com.company;
public class WhiteSauce extends ToppingDecorator{
    public WhiteSauce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Sauce!");
    }
    public String getDescription(){
        return tempPizza.getDescription() + ", Sauce";
    }
    public double getCost(){
        return tempPizza.getCost() + 0.35;
    }
}
