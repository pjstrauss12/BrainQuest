public class Treasure {
    private int value;
    private String title;

    // CONSTRUCTORS
  
    public Treasure(String title, int value) {
      this.value = value;
      this.title = title;
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
  
    /********************/
    /***** MUTATORS *****/
    /********************/

    public void value(int value) {
        this.value = value;
    }

    public void title(String title) {
        this.title = title;
    }

    // UTILITIES 
    
    @Override
    public String toString() {
        return this.title + " (" + this.value + "gold)";
    }
  }