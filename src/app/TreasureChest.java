package app;
import java.util.ArrayList;

public class TreasureChest {
    // INSTANCE VARIABLES
    private boolean locked = true;
    private ArrayList<Treasure> treasures = new ArrayList<>();

    // CONSTRUCTORS
    /** Hacked chest already opened.  Ready to take stuff out for
     * testing purposes
     */
     public TreasureChest(){
        locked = true;
    } 
    
     public TreasureChest(boolean hacked){
        locked = false;
        treasures.add(new Treasure("Shiny silver nickle", 5));
    }

    /**
     * Three options can happen when open is executed.  The chest can open or
     * the chest can fail to unlock or the chest can fail to unlock and all of
     * its treasures can be destroyed and the player can take damage
     * @return
     */
    public boolean open(){
        // roll the dice
        double odds = Math.random();

        // it's already open
        if (!locked){
            System.out.println("Already open.");
            return true;
        }

        // 70% chance the chest failed to unlock
        if (odds < .7){
            System.out.println("You failed to unlock the chest.");
            return false;
        } 

        // 20% chance the chest unlocks
        else if (odds < .9) {
            System.out.println("CHEST UNLOCKED.");
            this.locked = false;
            return true;
        }

        // chest clears itself and hurts the Player
        else {
            System.out.println("\nTHE CHEST EXPLODED!!! \n");
            treasures.clear(); // empties treasures
            Player.modifyHealth(-(int) (Math.random() * 30));
            return false;
        }
    }
    /**
     * Adds given treasure to the instance's collection
     * @param treasures
     */
    public void addTreasure(ArrayList<Treasure> treasures){
        for(int i = 0; i < treasures.size(); i++){
            this.treasures.add(treasures.get(i));
        }
    }

    /**
     * Removes a treasure from the instance's collection and returns it
     * @return
     */
    public Treasure randomTreasure(){
        if(this.treasures.size() == 0) return null;
        
        int t = (int)(Math.random() * treasures.size());
        return treasures.get(t);
    }

    /******** ACCESSORS ********/
    /**
     * returns the size of the treasures ArrayList
     * @return
     */
    public int size(){
        return this.treasures.size();
    }

    public boolean isLocked(){
        return this.locked;
    }
}
