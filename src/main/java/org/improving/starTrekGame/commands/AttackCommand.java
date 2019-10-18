package org.improving.starTrekGame.commands;

import org.improving.starTrekGame.Sector;
import org.improving.starTrekGame.Ship;
//h
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
            System.out.println(target.getxCord());
            System.out.println(target.getyCord());
            sector.removeDeadShip(target.getxCord(), target.getyCord());
            return target.destroyed();
        }
        return false;
    }

//    public boolean isValid() {
//
//    }
}
