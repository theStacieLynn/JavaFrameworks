package com.ruiz.hashset.treesetprocessing;

import java.util.HashSet;

public class UnionOfSets {

	public static void main(String[] args) {
		// Example 2
		HashSet<Integer> evenNumbers = new HashSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		System.out.println("HashSet1: "+evenNumbers);
		
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(3);
		numbers.add(5);
		System.out.println("HashSet2: "+numbers);
		
		//union of two sets
		numbers.addAll(evenNumbers);
		System.out.println("Union is: "+ numbers);
		

	}

}
