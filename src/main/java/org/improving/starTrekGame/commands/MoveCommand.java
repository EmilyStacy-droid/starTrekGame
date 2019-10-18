package org.improving.starTrekGame.commands;

import org.improving.starTrekGame.EnterpriseShip;
import org.improving.starTrekGame.Sector;
import org.improving.starTrekGame.Ship;

public class MoveCommand {
private Sector sector;
    public MoveCommand() {
    }


    public void execute(String input) {
        if (input.equalsIgnoreCase("Left")){
          sector.getEnterpriseShip().setLocation(sector.getEnterpriseShip().getEnterpriseX()-1, sector.getEnterpriseShip().getEnterpriseY());
            
        }
        else if (input.equalsIgnoreCase("right")){
            //move right
        }
        else if(input.equalsIgnoreCase("up")){
            //move up
        }
        else if(input.equalsIgnoreCase("down")){
            //move down
        }
        else
            System.out.println("Invalid input. Must move \"up\", \"down\", \"left\", or \"right\".");
    }
}