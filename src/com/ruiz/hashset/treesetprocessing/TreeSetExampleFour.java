package com.ruiz.hashset.treesetprocessing;

import java.util.Comparator;

public class TreeSetExampleFour implements Comparator<String> {

	public static void main(String[] args) {
//		Example three: sort the given TreeSet alphabetically in reverse order.
//		In this example, we will implement a Comparator class to sort the given TreeSet alphabetically in reverse order. 
//		By default, the TreeSet sorts data in ascending order. 
//		We can also sort TreeSet in a customized order by defining a new comparator class. 
//		In this comparator class, we need to override the ‘compare’ method to sort the elements of the TreeSet. 
//		This comparator object is then passed to the TreeSet constructor.

	}

	@Override
	public int compare(String citiesOne, String citiesTwo) {
		int value = citiesOne.compareTo(citiesTwo);
		//sort elements in reverse order
		if(value>0) {
			return -1;
		}else if(value <0) {
			return 1;
		}else {
			return 0;
		}
	}

}
