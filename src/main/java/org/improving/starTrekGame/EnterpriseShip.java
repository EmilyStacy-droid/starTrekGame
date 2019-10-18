package org.improving.starTrekGame;

import org.springframework.stereotype.Component;


public class EnterpriseShip extends Ship {

   @Override
    public boolean destroyed(){
       System.out.println("You unfortunately have lost the game!");
       return true;
   }
}
