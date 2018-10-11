package com.company;
import java.util.Scanner;

public class EncryptorTest {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Crypto World!");
        System.out.println("Which Algo would you like to choose?");
        Scanner in = new Scanner(System.in);
        String algName = in.next();
        System.out.println("Enter message you would like to encrypt?");
        Scanner inp = new Scanner(System.in);
        String msg = inp.next();
    }
}
