package org.improving.starTrekGame.commands;

import org.improving.starTrekGame.Sector;
import org.improving.starTrekGame.Ship;

public class MoveCommand {
    private Sector sector;
    private Ship ship;

    public MoveCommand(Sector sector, Ship ship) {
        this.sector = sector;
        this.ship = ship;
    }

    public void execute(String direction, int amount) {
        int xAmount = 0;
        int yAmount = 0;
        if (direction.equalsIgnoreCase("up")) {
            yAmount = -amount;
        } else if (direction.equalsIgnoreCase("down")) {
            yAmount = amount;
        } else if (direction.equalsIgnoreCase("right")) {
            xAmount = amount;
        } else if (direction.equalsIgnoreCase("left")) {
            xAmount = -amount;
        } else {
            System.out.println("Invalid input. Must move \"up\", \"down\", \"left\", or \"right\".");
            return ;
        }
        ship.setLocation(ship.getxCord() + xAmount, ship.getyCord() + yAmount);
        sector.setEnterpriseLocation();
    }
}