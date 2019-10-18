package org.improving.starTrekGame;

public class Ship {
    private int health;

    public void takeDamage(int damage){
        health -= damage;
    }

    public int getHealth() {
        return health;
    }
}
