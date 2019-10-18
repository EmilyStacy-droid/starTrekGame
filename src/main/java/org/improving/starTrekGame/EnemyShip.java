package org.improving.starTrekGame;

import java.util.Random;

public class EnemyShip {
    Random random = new Random();
    private String name;
    private int health = 100;
    int xCoord;
    int yCoord;

    public EnemyShip() {
        this.xCoord = random.nextInt(10);
        this.yCoord = random.nextInt(10);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getxCord() {
        return xCoord;
    }

    public void setxCord(int xCord) {
        this.xCoord = xCord;
    }

    public int getyCord() {
        return yCoord;
    }

    public void setyCord(int yCord) {
        this.yCoord = yCord;
    }
}
