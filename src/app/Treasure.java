package app;
public class Treasure {
    private int value;
    private String title;
    private boolean active;

    // CONSTRUCTORS
  
    public Treasure(String title, int value) {
      this.value = value;
      this.title = title;
      active = false;
    }
  
    public Treasure(String title) {
      this(title, 50);
    }
  
    /********************/
    /**** ACCESSORS *****/
    /********************/


    public int value() {
        return this.value;
    }

    public String title() {
        return this.title;
    }

    public boolean active(){
        return this.active;
    }
  
    /********************/
    /***** MUTATORS *****/
    /********************/

    public void value(int value) {
        this.value = value;
    }

    public void title(String title) {
        this.title = title;
    }

    /**Toggles the active state of the treasure */
    public void activate(){
        this.active = !this.active;
    }

    // UTILITIES 
    
    @Override
    public String toString() {
        return this.title + " (" + this.value + "gold)";
    }
  }