package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of ship (U/R/B)?");
        if (userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }
	    doStuffEnemy(theEnemy);
    }
    public static void doStuffEnemy(EnemyShip anEnemy){
        anEnemy.displayEnemyShip();
        anEnemy.followHero();
        anEnemy.shoots();
    }
}
