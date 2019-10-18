package org.improving.starTrekGame;

public class EnterpriseShip extends Ship {
    public EnterpriseShip() {
        super(2000);
    }

   @Override
    public boolean destroyed(){
       System.out.println("You unfortunately have lost the game!");
       return true;
   }

    @Override
    public String getMarker() {
        return "E";
    }
}
