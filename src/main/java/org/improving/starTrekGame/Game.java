package org.improving.starTrekGame;

import org.improving.starTrekGame.commands.AttackCommand;
import org.improving.starTrekGame.commands.MoveCommand;

import java.util.Scanner;

public class Game {
    private Sector sector;

    Game() {
        this.sector = new Sector();
    }

    public void intro() {
        System.out.println("Welcome to the Star Trek Game!");
        System.out.println( "| START | HELP | EXIT |");
        Scanner scanner = new Scanner(System.in);
        promptUser(scanner);
    }

    private void promptUser(Scanner scanner) {
        while(true) {
            System.out.print(">> ");
            String userChoice = scanner.nextLine();
            if (userChoice.equalsIgnoreCase("start")) {
                System.out.println("Beginning Game!");
                String[][] middleSector = sector.fillArray(new String[10][10]);
              //  sector.displaySector(middleSector); // need to move to game class
                useCommands(scanner);
                break;
            } else if (userChoice.equalsIgnoreCase("help")) {
                showTopLevelHelpCommands();
            } else if (userChoice.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }

    private void useCommands(Scanner scanner) {
        boolean loop = true;
        while (loop) {
            System.out.print(">> ");
            String userChoice = scanner.nextLine();
            if (userChoice.equalsIgnoreCase("attack")) {
                AttackCommand attackCommand = new AttackCommand();
                attackCommand.execute();
            } else if (userChoice.equalsIgnoreCase("move")) {
                MoveCommand moveCommand = new MoveCommand();
                moveCommand.execute();
            } else if (userChoice.equalsIgnoreCase("exit")) {
                return;
            } else if (userChoice.equalsIgnoreCase("help")) {
                showGameHelpCommands();
            }
        }
    }

    private void showGameHelpCommands() {
        System.out.println("HELP COMMANDS");
        System.out.println("'move ___' - moves you into a designated location");
        System.out.println("'attack _____' - attacks a ship of your choice.");
        System.out.println("'scan' - scan for surrounding enemy ships");
        System.out.println();
    }

    private void showTopLevelHelpCommands() {
        System.out.println("HELP COMMANDS:");
        System.out.println("START -- play the game!");
        System.out.println("HELP -- print this help text");
        System.out.println("EXIT -- exit the game :(");
        System.out.println();
    }


}