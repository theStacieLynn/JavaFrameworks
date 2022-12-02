package com.ruiz.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListClass {
	//Best practice when creating an ArrayList
	List<String> fruitList = new ArrayList<>();
	
	public void createList() {
		fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		
		System.out.println(fruitList);
		
		//Converting ArrayList to Array
		String[] array =fruitList.toArray(new String[fruitList.size()]);
		System.out.println("Printing Array: "+Arrays.toString(array));
		System.out.println("Printing List: "+fruitList);
	}
	public void createSet() {
		//declare two separate integer arrays
		//initialized arrays
		Integer [] A = {22,45,33,34,55,34,77};
		Integer [] B = {33,2,83,45,3,12,55};
		
		//create set A
		Set<Integer> set1 = new HashSet<Integer>();
		//addAll returns elements from the A array and stores in set1
		set1.addAll(Arrays.asList(A));
		System.out.println("Set 1: "+set1);
		
		//create another set
		//addAll returns elements from the B array and stores in set2
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(B));
		System.out.println("Set 2: "+set2);
		System.out.println();
		
		//Finding Union of set1 and set 2
		//Union operation returns all the elements of set1 and set2 in a single set
		//no duplicates
		Set<Integer> union_Data = new HashSet<Integer>(set1);
		union_Data.addAll(set2);
		System.out.println("Union of set1 and set2 is: ");
		System.out.println(union_Data);
		System.out.println();
		
		/**
		 * finding the intersection of set1 and set2
		 *the intersection operation returns all those elements which are present in both sets
		 */
		Set<Integer> intersectionData = new HashSet<Integer>(set1);
		intersectionData.retainAll(set2);
		System.out.println("Intersection of set1 and set2 is: ");
		System.out.println(intersectionData);
		System.out.println();
		
		/*
		 * Finding the difference between set1 and set2
		 * the difference operation deletes the values from the set which are present in another set
		 */
		Set<Integer> diffData = new HashSet<Integer>(set1);
		diffData.removeAll(set2);
		System.out.println("The Difference of set1 and set2 is: ");
		System.out.println(diffData);
		System.out.println();
	}

}
