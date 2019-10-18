package org.improving.starTrekGame;

import java.util.Random;

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

    public void placeShips() {
        int amountOfShips = random.nextInt(5) + 1; //Inserts up to 5 ships in the sector, the +1 asserts at least 1 ship will be placed in the sector.
        for (int i = 0; i < amountOfShips; i++) {
            int randomY = random.nextInt(10);
            int randomX = random.nextInt(10);
            grid[randomY][randomX] = ""+ (i+1);
            System.out.println("x, y cord is" + randomX + "," + randomY);
        }

    }

    public void setEnterpriseLocation() {
        int randomY = random.nextInt(10);
        int randomX = random.nextInt(10);
        grid[randomY][randomX] = "E";
        enterpriseShip.setLocation(randomX, randomY);
    }

}
