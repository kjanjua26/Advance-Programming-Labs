package com.company;
public class Main {
    public static void main(String[] args) {
        Animal tommy = new Dog();
        Animal birdy = new Bird();
        System.out.println("Bird: " + birdy.tryToFly());
        System.out.println("Dog: " + tommy.tryToFly());
    }
}
