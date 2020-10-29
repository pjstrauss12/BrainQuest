package app.tests;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 6;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {

		// BUILDING BLOCKS
        int[] shuffled = new int[values.length];

        int byOne = 0;
		int byTwo = 0;
		
        // loop through first half of values
        for(; byOne < values.length/2; byOne++){
            // use a second counter that goes up by 2
            shuffled[byTwo] = values[byOne];
            byTwo += 2;
        }
        // reset my byTwo counter
        byTwo = 1;
        // loop through second half of values
        for(; byOne < values.length; byOne++){
            // use the second counter that goes up by two
            shuffled[byTwo] = values[byOne];
            byTwo += 2;
        }

        // copy values from shuffled into values
        for(int i = 0; i < values.length; i++){
            values[i] = shuffled[i];
        }

	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		
		// loop from end of values to start
		for(int i = values.length - 1; i >= 0; i--){
			// draw a random number from 0 -> my iterator
			int r = (int)(Math.random() * i + 1);
			// 1) back up the value at the random index to a temp variable
			int temp = values[r];
			// 2) replace the value at the random spot with the val at the iterator
			values[r] = values[i];
			// 3) replace the val at the iterator with the temp
			values[i] = temp;
		}
	}
}