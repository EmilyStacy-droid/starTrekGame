package org.improving.starTrekGame;

public class EnterpriseShip extends Ship {


    @Override
    public boolean destroyed() {
        System.out.println("You unfortunately have lost the game!");
        return true;

    }
}
