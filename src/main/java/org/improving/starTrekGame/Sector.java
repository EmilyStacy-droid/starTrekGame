package org.improving.starTrekGame;

import java.util.Random;

public class Sector {
    private String[][] sector = new String[10][10];
    Random random = new Random();
    int shipNum;

    public String[][] fillArray(String[][] arrayName) {
        for (int i = 0; i < arrayName.length; i++) {
            for (int j = 0; j < arrayName[i].length ; j++) {
                arrayName[i][j] = ".";
            }
        }
        return arrayName;
    }

    public void displaySector(String[][] sector) {
        for (int i = 0; i < sector.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < sector[i].length; j++) {
                System.out.print(sector[i][j] + "\t");
            }
        }
        System.out.println();
    }

    public void placeShips(String[][] sector) {
        int amountOfShips = random.nextInt(5) + 1; //Inserts up to 5 ships in the sector, the +1 asserts at least 1 ship will be placed in the sector.
        for (int i = 0; i < amountOfShips; i++) {
            int randomY = random.nextInt(10);
            int randomX = random.nextInt(10);
            sector[randomY][randomX] = ""+ (i+1);
            System.out.println("x, y cord is" + randomX + "," + randomY);
        }

    }
}
