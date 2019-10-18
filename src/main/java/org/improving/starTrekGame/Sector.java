package org.improving.starTrekGame;

import java.util.ArrayList;
import java.util.List;

public class Sector {
    private EnterpriseShip enterpriseShip = new EnterpriseShip();
    private String[][] grid = new String[10][10];
    List<EnemyShip> enemyShips = new ArrayList<>();

    public Sector() {
        fillArray();
        setEnterpriseLocation();
        placeShips();
    }

    private void fillArray() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length ; j++) {
                grid[i][j] = ".";
            }
        }
    }

    public void displaySector() {
        for (int i = 0; i < grid.length; i++) {
            System.out.print("\n");

            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "\t");
            }
        }
        System.out.println();
    }

    private void placeShips() {
        int shipIndex = 0;
        for (int i = 0; i < 5; i++) {
            enemyShips.add(new EnemyShip(i + 1));
        }

        for(EnemyShip e: enemyShips) {
            shipIndex ++;
            grid[e.getxCord()][e.getyCord()] = "" + shipIndex;
        }
    }

    private void setEnterpriseLocation() {
        grid[enterpriseShip.getxCord()][enterpriseShip.getyCord()] = "E";
    }

    public void removeDeadShip(Ship ship) {
        this.grid[ship.getxCord()][ship.getyCord()] = ".";
        this.enemyShips.remove(ship);
    }

    public List<EnemyShip> getEnemyShips() {
        return enemyShips;
    }


    public boolean allEnemiesDestroyed() {
        return enemyShips.isEmpty();
    }

    public EnterpriseShip getEnterpriseShip() {
        return enterpriseShip;
    }

    public void move(Ship ship, int newX, int newY) {
        int oldX = ship.getxCord();
        int oldY = ship.getyCord();
        grid[oldX][oldY] = ".";
        ship.setLocation(newX, newY);

        grid[newX][newY] = ship.getMarker();
    }
}

