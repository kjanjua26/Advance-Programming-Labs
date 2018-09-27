package com.company;

import com.company.BigUFOClass;
import com.company.EnemyShip;

public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String newShipType){
        if(newShipType.equals("U")){
            return  new UFOEnemyShip();
        }else if(newShipType.equals("R")){
            return new RocketEnemyShip();
        }else if (newShipType.equals("B")){
            return new BigUFOClass();
        }else{
            return null;
        }
    }
}
