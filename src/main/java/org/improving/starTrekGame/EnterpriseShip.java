package org.improving.starTrekGame;

public class EnterpriseShip extends Ship {
    private int x;
    private int y;
    private Sector sector;

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getEnterpriseX () {
        return x;
    }

    public int getEnterpriseY() {
        return y;
    }
}
