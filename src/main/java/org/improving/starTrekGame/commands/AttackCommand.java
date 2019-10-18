package org.improving.starTrekGame.commands;

import org.improving.starTrekGame.Sector;
import org.improving.starTrekGame.Ship;

public class AttackCommand {
    private final Sector sector;
    private final Ship target;
    private final int damageAmount;
    private final Ship attacker;

    public AttackCommand(Ship attacker, Ship target, int damageAmount, Sector sector) {
        this.attacker = attacker;
        this.target = target;
        this. damageAmount = damageAmount;
        this.sector = sector;
    }

    public boolean execute() {
        if (!attacker.isInRange(target)) {
            System.out.println("Cannot attack target " + target.getMarker() + ", it is not in range!");
            return false;
        }
        target.takeDamage(damageAmount);
        if (target.getHealth() <= 0) {
            System.out.println(target.getxCord());
            System.out.println(target.getyCord());
            sector.removeDeadShip(target);
            return target.destroyed();
        }
        return false;
    }

}
