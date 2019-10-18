package org.improving.starTrekGame.commands;

public class MoveCommand {

    public MoveCommand() {
    }

    public void execute(String input) {
        if (input.equalsIgnoreCase("Left")){
            //move left
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