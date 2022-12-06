package com.ruiz.hashset.treesetprocessing;

import java.util.TreeSet;

public class TreeSetExampleTwo {

	public static void main(String[] args) {
		// remove() - removes the specified element from the set.
		//removeAll() - removes all the elements from the set.
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("TreeSet: "+numbers);
		
		//Using the remove method
		boolean value1 = numbers.remove(5);
		System.out.println("Is 5 removed? "+value1);
		
		//Using removeAll() method
		boolean value2 =numbers.removeAll(numbers);
		System.out.println("Are all elements removed? "+value2);

	}

}
