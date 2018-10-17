package com.company;

public class ItalianHoagie extends Hoagie{
    String[] meatUsed = {"Salami", "Pepperoni", "Ham"};
    String[] cheeseUsed = {"Provolone"};
    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

    @Override
    void addCheese() {
        System.out.print("Adding Cheese: ");
        for(String cheese: cheeseUsed)
            System.out.print(cheese + " ");
    }

    @Override
    void addMeat() {
        System.out.print("Adding meat: ");
        for(String meat: meatUsed)
            System.out.print(meat + " ");
    }

    @Override
    void addVegetables() {
        System.out.print("Adding Veggies: ");
        for(String meat: veggiesUsed)
            System.out.print(meat + " ");

    }

    @Override
    void addCondiments() {
        System.out.print("Adding condiments: ");
        for(String condiments: condimentsUsed)
            System.out.print(condiments + " ");
    }
}
