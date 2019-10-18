package org.improving.starTrekGame;

import org.springframework.stereotype.Component;


public abstract class Ship {
    private int x;
    private int y;
    private int health;


    public void takeDamage(int damage){
        health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getyCord() {
        return y;
    }

    public int getxCord() {
        return x;
    }

    public abstract boolean destroyed();
}
