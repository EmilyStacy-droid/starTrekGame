package org.improving.starTrekGame.commands;

public class AttackCommand {
    private String input;

    public AttackCommand(String input) {
        this.input = input;
    }

    public void execute() {
        System.out.println("attacking!");
    }

//    public boolean isValid() {
//
//    }
}
