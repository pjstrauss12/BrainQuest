package app.tests;

/*
Your job is to create two classes that implement this interface, NumGrid and NumRow.
NumGrid has an ArrayList of NumRows, making it a 2D collection. NumGrid has the ability
to sort each of its NumRows and provide a total sum using the functions available within
the NumRows. However, the shuffle method in the NumGrid rearranges items across the rows
and cannot be left to the NumRows to execute individually. 
*/

public interface NumGroup {
    
    /**
     * Provides a total sum of its contained numbers
     * @return accumulated total
     */
    int sum();

    /**
     * Organizes its contained numbers to be sorted from least to great
     * using the selection sort algorithm
     */
    void sort();

    /**
     * Rearranges its contained numbers using the selection shuffle algorithm
     */
    void shuffle();

    /**
     * Displays the contained numbers in a returned string
     * @return formatted String display
     */
    String toString();
    
}