package org.improving.starTrekGame;

public class Earth {
    public static void main(String[] args) {
        Game game = new Game();
        Sector sector = new Sector();
        String[][] middleSector = sector.fillArray(new String[10][10]);

        game.intro();
        sector.displaySector(middleSector);
    }
}
