package app;
import java.util.ArrayList;

/**
 * Static container for player status and details
 */
public class Player {
    private static int health = 100;
    private static String name;
    private static double crit = .35;
    private static ArrayList<Collectable> satchel = new ArrayList<>();

    // *********
    // ACCESSORS
    // *********

    public static String name() {
        return name;
    }

    public static int health() {
        return health;
    }

    public static double critChance() {
        // TODO: Calculate any active items' effect on your crit
        return crit;
    }

    /** Return the current count of items in your satchel */
    public static int satchelSize(){
        return satchel.size();
    }

    /** Return the Player's stachel reference */
    public static ArrayList<Collectable> satchel(){
        return satchel;
    }

    // *********
    // MUTATORS
    // *********

    public static void pickupTreasure(Collectable t){
        // add treasure to ArrayList
        satchel.add(t);
    }

    public static void modifyHealth(int change){
        health += change;
        System.out.println("Player's health is: " + health);
    }

    // *********
    // UTILITIES
    // *********
    /** A new arraylist of Treasures is populated by all the treasures
     * from the Player's satchel that are currently set to active
     */
    public static ArrayList<Collectable> activeTreasures(){
        // builds and returns a list of active treasures
        ArrayList<Collectable> results = new ArrayList<>();
        for(Collectable t : satchel){
            if(t.active()) results.add(t);
        }

        return results;
    }

    public static boolean criticalHit(){
        return Math.random() < critChance();
    }

    public static int randomRange(int low, int high){
        // what's my range?
        int range = high - low;
        return (int)(Math.random() * (range + 1) + low);
    }
}
