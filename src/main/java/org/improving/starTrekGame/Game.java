package org.improving.starTrekGame;

import java.util.Scanner;

public class Game {


    Game() {
    }

    public void intro() {
        System.out.println("Welcome to the Star Trek Game!");
        System.out.println( " START | HELP ");
        Scanner scanner = new Scanner(System.in);
        promptUser(scanner);


    }

    private void promptUser(Scanner scanner) {

        System.out.print(">>");
        String userChoice = scanner.nextLine();
        if (userChoice.equalsIgnoreCase("start")) {
            System.out.println("Would start sector");
        }
        if (userChoice.equalsIgnoreCase("help")) {
            showHelpCommands();
        }
    }

    private void showHelpCommands() {
        System.out.println("HELP COMMANDS:");
        System.out.println("'move ___' - moves you into a designated location");
        System.out.println("'attack _____' - attacks a ship of your choice.");
        System.out.println("'scan' - scan for surrounding enemy ships");
    }

}