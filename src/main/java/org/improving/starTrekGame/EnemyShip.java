package org.improving.starTrekGame;

import java.util.Random;

public class EnemyShip extends Ship {
    Random random = new Random();
    private String name;
    int xCoord;
    int yCoord;

    public EnemyShip() {
        this.xCoord = random.nextInt(10);
        this.yCoord = random.nextInt(10);
    }



    public int getxCord() {
        return xCoord;
    }

    public int getyCord() {
        return yCoord;
    }

    public void setyCord(int yCord) {
        this.yCoord = yCord;
    }

}
