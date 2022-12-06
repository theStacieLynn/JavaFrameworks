package com.ruiz.hashset.treesetprocessing;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExampleOne {
//	To access the individual elements of TreeSet, 
//	we need to iterate through the TreeSet. 
//  In other words, traverse through the TreeSet.
//	We do this by declaring an Iterator for the TreeSet, 
//	and then use this Iterator to access each element. 
//  For this, we use the next () method of an iterator that returns the next element in the TreeSet.
	public static void main(String[] args) {
		TreeSet<Integer> num_TreeSet = new TreeSet<>();
		num_TreeSet.add(20);
		num_TreeSet.add(5);
		num_TreeSet.add(15);
		num_TreeSet.add(25);
		num_TreeSet.add(10);
		
		//Call iterator() method to define Iterator for TreeSet
		Iterator<Integer> iter_set = num_TreeSet.iterator();
		//Access TreeSet elements using Iterator
		while(iter_set.hasNext()) {
			System.out.print(iter_set.next());
			System.out.print(", ");
		}
		

	}

}
