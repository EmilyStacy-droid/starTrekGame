package org.improving.starTrekGame;

import java.util.ArrayList;
import java.util.List;

public class Sector {
    private EnterpriseShip enterpriseShip = new EnterpriseShip();
    private String[][] grid = new String[10][10];
    List<EnemyShip> enemyShips = new ArrayList<>();

    public void fillArray() {
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

    public void placeShips() {
        int shipIndex = 0;
        for (int i = 0; i < 5; i++) {
            enemyShips.add(new EnemyShip(i + 1));
        }

        for(EnemyShip e: enemyShips) {
            shipIndex ++;
            grid[e.getyCord()][e.getxCord()] = "" + shipIndex;
        }
    }

    public void setEnterpriseLocation() {
        grid[enterpriseShip.getxCord()][enterpriseShip.getyCord()] = "E";
    }

    public void removeDeadShip(int x, int y) {
        grid[x][y] = ".";
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
}

