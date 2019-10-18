package org.improving.starTrekGame.commands;

import org.improving.starTrekGame.Ship;

public class AttackCommand {
    private Ship target;
    private int damageAmount;
    public AttackCommand(Ship target, int damageAmount) {
        this.target = target;
        this. damageAmount = damageAmount;
    }

    public void execute() {
        target.takeDamage(damageAmount);
    }

//    public boolean isValid() {
//
//    }
}
