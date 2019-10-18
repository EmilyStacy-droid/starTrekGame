package org.improving.starTrekGame;

import java.util.Random;

public abstract class Ship {
    Random random = new Random();

    private int x;
    private int y;
    private int health;
    private int attackRange;
    private String name;

    public Ship(int health, int attackRange) {
        this.health = health;
        this.attackRange = attackRange;
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

    public int getAttackRange() {
        return attackRange;
    }

    public boolean isInRange(Ship other) {
        int deltaX = Math.abs(getxCord() - other.getxCord());
        int deltaY = Math.abs(getyCord() - other.getyCord());
        if (deltaX > attackRange || deltaY > attackRange) {
            return false;
        }
        return true;
    }

    public abstract boolean destroyed();

    public abstract String getMarker();
}
