package com.ruiz.hashset.treesetprocessing;

import java.util.TreeSet;

public class TreeSetExampleThree {

	public static void main(String[] args) {
		//Methods for navigation
		
		//first and last methods
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(6);
		System.out.println("TreeSet: "+ numbers);
		
		//Using the first method
		int first = numbers.first();
		System.out.println("First number: "+first);
		
		//Using last method
		int last = numbers.last();
		System.out.println("Last number: "+last);
		


	}

}
