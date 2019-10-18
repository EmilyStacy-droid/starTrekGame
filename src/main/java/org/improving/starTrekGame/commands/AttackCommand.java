package org.improving.starTrekGame.commands;

import org.improving.starTrekGame.Sector;
import org.improving.starTrekGame.Ship;
import org.springframework.stereotype.Component;


public class AttackCommand {
    private final Sector sector;
    private final Ship target;
    private final int damageAmount;

    public AttackCommand(Ship target, int damageAmount, Sector sector) {
        this.target = target;
        this. damageAmount = damageAmount;
        this.sector = sector;
    }

    public boolean execute() {
        target.takeDamage(damageAmount);
        if (target.getHealth() <= 0) {
            return target.destroyed();
        }
        sector.removeDeadShip(target.getxCord(), target.getyCord());
        return false;
    }

//    public boolean isValid() {
//
//    }
}
