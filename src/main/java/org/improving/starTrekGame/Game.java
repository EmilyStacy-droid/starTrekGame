package org.improving.starTrekGame;

import org.improving.starTrekGame.commands.AttackCommand;
import org.improving.starTrekGame.commands.MoveCommand;
import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Game {
    private Sector sector;

    Game() {
        this.sector = new Sector();
    }

    public void intro() {
        System.out.println("                                       WELCOME TO");
        starTrekFont();
        System.out.println( "                               | START | HELP | EXIT |");
        Scanner scanner = new Scanner(System.in);
        startMenu(scanner);
    }

    private void startMenu(Scanner scanner) {
        while(true) {
            System.out.print(">> ");
            String userChoice = scanner.nextLine();
            if (userChoice.equalsIgnoreCase("start")) {
                System.out.println("Beginning Game!");
                sector.displaySector(); // need to move to game class
                System.out.println();
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
            String userChoice = scanner.nextLine().trim();
            String[] parsed = userChoice.split(" ");
            String command = parsed[0];
            if (command.equalsIgnoreCase("attack")) {
                int target = Integer.parseInt(parsed[1]);
                for (int i = 0; i < sector.getEnemyShips().size(); i++) {
                    if (target == sector.getEnemyShips().get(i).getId()) {
                        target = i;
                    }
                }
                AttackCommand attackCommand = new AttackCommand(sector.getEnemyShips().get(target), 50, sector); //TODO Change later.
                attackCommand.execute();
                for (int i = 0; i < sector.getEnemyShips().size(); i++) {
                    attackCommand = new AttackCommand(sector.getEnterpriseShip(), 25, sector);
                    if (attackCommand.execute())
                        break;
                }
            } else if (command.equalsIgnoreCase("move")) {
                MoveCommand moveCommand = new MoveCommand(sector, sector.getEnterpriseShip());
                moveCommand.execute(parsed[1], Integer.parseInt(parsed[2]));
            } else if (command.equalsIgnoreCase("exit")) {
                return;
            } else if (command.equalsIgnoreCase("help")) {
                showGameHelpCommands();
            }
            sector.displaySector();
            if (sector.allEnemiesDestroyed()){
                System.out.println(
                        "                              __ \n" +
                                " __ __                  _    |  |\n" +
                                "|  |  |___ _ _    _ _ _|_|___|  |\n" +
                                "|_   _| . | | |  | | | | |   |__|\n" +
                                "  |_| |___|___|  |_____|_|_|_|__|\n" +
                                "                                 ");
                break;
            }}
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

    private void starTrekFont() {
        System.out.println(" ________  _________  ________  ________          _________  ________  _______   ___  __       ");
        System.out.println("|\\   ____\\|\\___   ___\\\\   __  \\|\\   __  \\        |\\___   ___\\\\   __  \\|\\  ___ \\ |\\  \\|\\  \\     ");
        System.out.println("\\ \\  \\___|\\|___ \\  \\_\\ \\  \\|\\  \\ \\  \\|\\  \\       \\|___ \\  \\_\\ \\  \\|\\  \\ \\   __/|\\ \\  \\/  /|_  ");
        System.out.println(" \\ \\_____  \\   \\ \\  \\ \\ \\   __  \\ \\   _  _\\           \\ \\  \\ \\ \\   _  _\\ \\  \\_|/_\\ \\   ___  \\  ");
        System.out.println("  \\|____|\\  \\   \\ \\  \\ \\ \\  \\ \\  \\ \\  \\\\  \\|           \\ \\  \\ \\ \\  \\\\  \\\\ \\  \\_|\\ \\ \\  \\\\ \\  \\ ");
        System.out.println("    ____\\_\\  \\   \\ \\__\\ \\ \\__\\ \\__\\ \\__\\\\ _\\            \\ \\__\\ \\ \\__\\\\ _\\\\ \\_______\\ \\__\\\\ \\__\\");
        System.out.println("  |\\_________\\   \\|__|  \\|__|\\|__|\\|__|\\|__|            \\|__|  \\|__|\\|__|\\|_______|\\|__| \\|__|");
        System.out.println("   \\|_________|      ");

    }




}