package org.improving.starTrekGame;

import org.improving.starTrekGame.commands.AttackCommand;

import java.util.Scanner;

public class Game {
    private Sector sector;

    Game() {
        this.sector = new Sector();
    }

    public void intro() {
        System.out.println("Welcome to the Star Trek Game!");
        System.out.println( "| START | HELP |");
        Scanner scanner = new Scanner(System.in);
        promptUser(scanner);


    }

    private void promptUser(Scanner scanner) {
        boolean loop = true;
        while (loop) {
            System.out.print(">> ");
            String userChoice = scanner.nextLine();
            if (userChoice.equalsIgnoreCase("start")) {
                System.out.println("Would start sector");
                String[][] middleSector = sector.fillArray(new String[10][10]);
                sector.displaySector(middleSector); // need to move to game class
                useCommands();
            }
            if (userChoice.equalsIgnoreCase("help")) {
                showHelpCommands();
            }

            if (userChoice.equalsIgnoreCase("attack")) {
                AttackCommand attackCommand = new AttackCommand(userChoice);
                attackCommand.execute();
            }
            if (userChoice.equalsIgnoreCase("exit")) {
                loop = false;
            }
        }
    }

    private void useCommands() {
    }

    private void showHelpCommands() {
        System.out.println("HELP COMMANDS:");
        System.out.println("'move ___' - moves you into a designated location");
        System.out.println("'attack _____' - attacks a ship of your choice.");
        System.out.println("'scan' - scan for surrounding enemy ships");
    }


}