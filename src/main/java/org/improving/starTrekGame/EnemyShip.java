package org.improving.starTrekGame;

import java.util.Random;

public class EnemyShip extends Ship {

    public EnemyShip() {
        super(100);
    }

    @Override
    public boolean destroyed() {
        System.out.println("You have destroyed this ship!");
        return false;
    }
}
