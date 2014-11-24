/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author: Oliver S. Smart
 * date:   from 24 Nov 2014
 *  
 * Day 9 Exercise 2 Trees as sets
 *
 * IntSet implementation using a tree structure.
 */

public class TreeIntSet implements IntSet {

        // we need a do we need a root node
	private TreeIntSetNode root;
	
	TreeIntSet() { // constructor
		root = null;
	}

        /*
         * add(int) adds a new int to the set; if it is there already, nothing happens.
         */
	public void add( int num) {
		if (root == null) {
			root = new TreeIntSetNode( num);
		} else {
			root.add(num);
		}
			
	}

	/*
         * contains(int)  returns true if the number is in the set, false otherwise.
	 */
	public boolean contains( int num) {
		return root.contains( num, false);
	}

	/*
         * containsVerbose(int) returns the same values as the former method, 
	 * but for every element that is checked prints its value on screen.
	 */
	public boolean containsVerbose( int num) {
		return root.contains( num, true);
	}

	/* 
         * toString() returns a string with the values of the elements in the 
         * set separated by commas.
	 */
	@Override
	public String toString() {
		return "" + root;
	}

}
