package org.improving.starTrekGame;


public class EnemyShip extends Ship {
    private int id;

    public EnemyShip(int Id) {
        super(100);
       this.id = Id;
    }

    @Override
    public boolean destroyed() {
        System.out.println("You have destroyed this ship!");
        return false;
    }

    @Override
    public String getMarker() {
        return "" + id;
    }

    public int getId() {
        return id;
    }


}
