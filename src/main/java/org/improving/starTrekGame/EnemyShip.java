package org.improving.starTrekGame;

import org.springframework.stereotype.Component;

import java.util.Random;

public class EnemyShip extends Ship {

    private int id;

    public EnemyShip(int Id) {
        super(100);
       this.id = Id;
    }

    @Override
    public boolean destroyed() {
        System.out.println("You have destroyed this ship!");
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
