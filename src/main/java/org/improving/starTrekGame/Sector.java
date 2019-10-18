package org.improving.starTrekGame;

import java.util.List;
import java.util.Random;
//hi
public class Sector {
    private EnterpriseShip enterpriseShip = new EnterpriseShip();
    private String[][] grid = new String[10][10];
    Random random = new Random();
    int shipNum;

    public String[][] fillArray() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length ; j++) {
                grid[i][j] = ".";
            }
        }
        return grid;
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

    public List<EnemyShip> placeShips(List<EnemyShip> shipList) {
        int shipIndex = 0;
        for (int i = 0; i < 5; i++) {
            shipList.add(new EnemyShip());
        }

        for(EnemyShip e: shipList) {
            shipIndex ++;
            grid[e.getyCord()][e.getxCord()] = "" + shipIndex;
        }
        return shipList;

    }

    public void setEnterpriseLocation() {
        int randomY = random.nextInt(10);
        int randomX = random.nextInt(10);
        grid[randomY][randomX] = "E";
        enterpriseShip.setLocation(randomX, randomY);
    }

}
