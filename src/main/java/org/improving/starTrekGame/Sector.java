package org.improving.starTrekGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//hi
public class Sector {
    private EnterpriseShip enterpriseShip = new EnterpriseShip();
    private String[][] grid = new String[10][10];
    List<EnemyShip> enemyShips = new ArrayList<>();
    Random random = new Random();
    int shipNum;


    public String[][] getGrid() {
        return grid;
    }

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
            enemyShips.add(new EnemyShip());
        }

        for(EnemyShip e: enemyShips) {
            shipIndex ++;
            grid[e.getyCord()][e.getxCord()] = "" + shipIndex;
        }
    }

    public void setEnterpriseLocation() {
        int randomY = random.nextInt(10);
        int randomX = random.nextInt(10);
        grid[randomY][randomX] = "E";
        enterpriseShip.setLocation(randomX, randomY);
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
}
