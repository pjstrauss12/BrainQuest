package app.creatures;

import app.Treasure;

public class Villager extends Creature {
    
    //CONSTRUCTORS

    public Villager(){
        super("Villager");
    }
    public Villager(String name){
        super(name);
    }
    public Villager(String name, int health){
        super(name, health);
    }
    public Villager(String name, Treasure t){
        super(name, t);
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub

    }
}
