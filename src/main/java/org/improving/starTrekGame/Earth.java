package org.improving.starTrekGame;

public class Earth {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        Sector sector = new Sector();
        String[][] middleSector = sector.fillArray(new String[10][10]);
        sector.displaySector(middleSector);


    }
}
