/**
 * A basic building block for an opponent
 */

public class Creature {
    // INSTANCE VARAIBLES
    private String name;
    private int health = 100;
    private Treasure booty;  

    /**
     * the Creature object's constructor
     */
    public Creature(String name) {
        System.out.println(name + " is born!");
        this.name = name;

    }

    public Creature(String name, Treasure t) {
        this(name);
        this.booty = t;
    }

    public Creature(String name, int health) {
        this(name);
        this.health = health;
    }

    /**
     * Overloaded constructor
     */
    public Creature() {
        this.name = "Villager";
    }

    // ACCESSORS -- part of the concept of encapsulation

    public String name() {
        return this.name;
    }

    public int health() {
        return this.health;
    }

    public Treasure getTreasure() {
        return this.booty;
    }

    // MUTATOR -- another part of encapsulation
    
    public void name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " - Health: " + this.health;
    }
}
