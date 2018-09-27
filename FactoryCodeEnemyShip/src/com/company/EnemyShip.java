package com.company;

public class EnemyShip {
    private String name;
    private double amtDamage;

    public String getName(){return name;}
    public void setName(String name) {this.name = name;}

    public double getDamage(){return amtDamage;}
    public void setDamage(double amtDamage) {this.amtDamage = amtDamage;}

    public void followHero(){
        System.out.println(getName() + " is following the hero!");
    }

    public void displayEnemyShip(){
        System.out.println(getName() + " is on the screen!");
    }

     public void shoots(){
        System.out.println(getName() + " attacks and does " + getDamage());
     }


}
