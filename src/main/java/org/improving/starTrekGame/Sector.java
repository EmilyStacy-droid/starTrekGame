package org.improving.starTrekGame;

import java.util.Random;

public class Sector {
    private String[][] sector = new String[10][10];
    Random random = new Random();
    int shipNum;

    public String[][] fillArray(String[][] arrayName){
        for (int i = 0; i < arrayName.length - 1; i++){
            for (int j = 0; j < arrayName[i].length; j++) {
                arrayName[i][j] = ".";
            }
        }
        return arrayName;
    }

    public void displaySector(String[][] sector){
        for (int i = 0; i < sector.length - 1; i++){
            System.out.print("\n");
            for (int j = 0; j < sector[i].length; j++) {
                System.out.print(sector[i][j] + "\t");
            }
        }
    }
}
