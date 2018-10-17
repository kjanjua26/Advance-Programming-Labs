package com.company;

public class VeggieHoagie extends Hoagie{
    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions"};
    String[] condimentsUsed = {"Oil", "Vinegar"};
    boolean customerWantsMeat(){return false;}
    boolean customerWantsCheese(){return false;}

    @Override
    void addCheese(){}
    @Override
    void addMeat(){}
    @Override
    void addVegetables() {
        System.out.print("Adding Veggies: ");
        for(String meat: veggiesUsed)
            System.out.print(meat + " ");
    }
    @Override
    void addCondiments() {
        System.out.print("Adding condiment: ");
        for(String condiments: condimentsUsed)
            System.out.print(condiments + " ");
    }
}
