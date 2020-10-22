package app.tests;

import java.util.ArrayList;

import app.Player;
import app.Treasure;
import app.TreasureChest;
import app.creatures.Creature;
import app.creatures.Dragon;
import app.creatures.Villager;

public class UnitTest {

    public static void main(String[] args) {

        // CREATE A CREATURE
        System.out.print("\nShould announce a creature: ");
        Creature a = new Villager("Hockey Player");
        System.out.println();

        // CHECK CREATURE'S HEALTH
        System.out.print("\nHealth should be set to 100: ");
        System.out.println(a.health() == 100);
        System.out.println();

        // CHECK CREATURE'S TREASURE
        System.out.print("\nCreature should have no default treasure: ");
        System.out.println(a.getTreasure() == null);
        System.out.println();

        // BUILD A TREASURE
        System.out.print("\nTreasure's name is Golden Hockeystick: ");
        Treasure gh = new Treasure("Golden Hockeystick");
        System.out.println(gh.title().equals("Golden Hockeystick"));
        System.out.println();

        // TEST THE PLAYER
        System.out.print("\nPlayer should have 100 health: ");
        System.out.println(Player.health() == 100);
        System.out.println();

        // PICK UP A TREAUSRE
        Player.pickupTreasure(gh);
        System.out.print("\nPlayer should have 1 item: ");
        System.out.println(Player.satchelSize() == 1);
        System.out.println();

        // ACTIVATE TREASURE
        System.out.print("\nPlayer should have no active items: ");
        System.out.println(Player.activeTreasures().size() == 0);
        Player.satchel().get(0).activate();
        System.out.print("\nPlayer should have 1 active item: ");
        System.out.println(Player.activeTreasures().size() == 1);
        System.out.println();

        // FILL A TREASURE CHEST
        System.out.print("\nTreasure chest should have zero items: ");
        TreasureChest tc = new TreasureChest();
        System.out.println(tc.size() == 0);
        ArrayList<Treasure> treasures = new ArrayList<>();
        treasures.add(gh);
        treasures.add(new Treasure("Pickle Rick"));
        treasures.add(new Treasure("Sword of Galantry", 3000));
        tc.addTreasure(treasures);
        System.out.print("\nTreasure chest should have three more items: ");
        System.out.println(tc.size() == 3);
        System.out.println();

        // OPEN A TREASURE CHEST
        System.out.print("\nTreasure chest should be locked: ");
        System.out.println(tc.isLocked() == true);
        System.out.print("\n Treasure chest's open should return true/false: ");
        System.out.println(tc.open());
        System.out.println();

        // DRAW A RANDOM CHEST FROM A CHEST
        TreasureChest hacked = new TreasureChest(false);
        System.out.print("\nTreasure chest yields a treasure: ");
        System.out.println(hacked.randomTreasure() != null);

        // CREATE A DRAGON
        Dragon smaug = new Dragon("Smaug the Terrible");
        System.out.print("\nDragon should be alive: ");
        System.out.println(smaug.alive());

        // OOPY -> Object Oriented.  I've broken the files down into 
        // inherited, modular, reusable components.

        // DRY -> Don't repeat yourself.  I've used class inheritance to
        // avoid repeating the same code like storing health, names, etc...
        
    }
}