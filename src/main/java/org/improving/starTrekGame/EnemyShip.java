package org.improving.starTrekGame;

import org.springframework.stereotype.Component;

import java.util.Random;

public class EnemyShip extends Ship {
    Random random = new Random();

    public EnemyShip() {
        setLocation(random.nextInt(10), random.nextInt(10));
    }

    @Override
    public boolean destroyed() {
        System.out.println("You have destroyed this ship!");
        return false;
    }
}
