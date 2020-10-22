package app.tests;
import java.util.ArrayList;

public class zPractice {

	public static void main(String[] args) {
		
		// create a primitive
		int myPrimitive = 5;
		// pass it by value to a method that adds one to the item.

		addOne(myPrimitive);
        // print the unchanged value of the primitive
        // use interprolation instead of concatination
		System.out.println(String.format("Primitive: %d", myPrimitive));
		
		// instantiate a list and store the reference to it in myRef
		ArrayList<Integer> myRef = new ArrayList<>();
		// add the value 5 to a new Integer 
		myRef.add(5);
		// pass it by reference to a method that adds one to the first element in the list
		addOne(myRef);
		// print what's now in the first spot of the object that was passed by reference
		System.out.println("Reference: " + myRef.get(0));
		
	} // closes main
	
	public static void addOne(ArrayList<Integer> x) {
		// get the current value of the first item in the list, convert to int
		int current = (int)x.get(0);
		// set the first item's value to one more than its current
		x.set(0, ++current);
	}
	
	public static void addOne(int x) {
		x = x+ 1;
	}

} // closes the class
	