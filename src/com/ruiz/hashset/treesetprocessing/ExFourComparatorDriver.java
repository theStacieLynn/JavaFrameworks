package com.ruiz.hashset.treesetprocessing;

import java.util.TreeSet;

public class ExFourComparatorDriver {

	public static void main(String[] args) {
		// Create a treeSet with user-defined comparator
		TreeSet<String> cities = new TreeSet<>(new TreeSetExampleFour());
		//add elements to comporator
	       cities.add("UAE");
	       cities.add("Mumbai");
	       cities.add("NewYork");
	       cities.add("Hyderabad");
	       cities.add("Karachi");
	       cities.add("Xanadu");
	       cities.add("Lahore");
	       cities.add("Zagazig");
	       cities.add("Yingkou");
	       
	       //print the contents of TreeSet
	       System.out.println("TreeSet in decending order: "+cities);

	}

}
