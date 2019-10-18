package org.improving.starTrekGame;

import java.util.Random;

public abstract class Ship {
    Random random = new Random();

    private int x;
    private int y;
    private int health;

    public Ship(int health) {
        this.health = health;
        setLocation(random.nextInt(10), random.nextInt(10));
    }

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
