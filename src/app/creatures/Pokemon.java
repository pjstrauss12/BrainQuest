package app.creatures;

import app.Collectable;

public class Pokemon extends Creature implements Collectable {

    public Pokemon(){
        super("Dragon");
    }

    public Pokemon(String name){
        super(name);
    }
    @Override
    public void attack() {
        // TODO Auto-generated method stub

    }

    @Override
    public int value() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean active() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void activate() {
        // TODO Auto-generated method stub

    }
    
}
