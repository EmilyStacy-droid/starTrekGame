package org.improving.starTrekGame;

import org.springframework.stereotype.Component;

import java.util.List;

public class Turn {
    private List<EnemyShip> enemyShips;
    private EnterpriseShip homeShip;
    private Sector sector;

    public Turn(Sector sector) {
        this.enemyShips = sector.getEnemyShips();
        this.homeShip = sector.getEnterpriseShip();
        this.sector = sector;

    }

    public void homeAttacks(String input) {
        input = input.trim();
        String split[] = input.split(" ");
        int ship = Integer.parseInt(split[1]);
       // enemyShips.get(ship).setHealth((enemyShips.get(ship).getHealth()) - 10);
        System.out.println(enemyShips.get(ship).getHealth());

        if(enemyShips.get(ship).getHealth() > 0) {
            enemyAttacks();
        }
        if (enemyShips.get(ship).getHealth() <= 0) {
            System.out.println("DEAD");
        }
    }

    public void enemyAttacks() {
        for(EnemyShip e: enemyShips) {
          //  homeShip.setDamageTaken(homeShip.getDamageTaken - 10)
        }
    }
}

