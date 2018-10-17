package com.company;

public class Main {
    public static void main(String[] args) {
        Hoagie cust12Hoagie = new ItalianHoagie();
        cust12Hoagie.makeSandwich(); // call to the template method.
        System.out.println();
        Hoagie cust13Hoagie = new VeggieHoagie();
        cust13Hoagie.makeSandwich();
    }
}
