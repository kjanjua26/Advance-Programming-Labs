package com.company;

public class Main {
    public static void main(String[] args) {
        Pizza basicPizza = new WhiteSauce(new Mozzarella(new PlainPizza())); // Create a basic pizza.
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Cost: " + basicPizza.getCost());
    }
}
