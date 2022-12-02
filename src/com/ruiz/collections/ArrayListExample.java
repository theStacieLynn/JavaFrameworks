package com.ruiz.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("Austin");
		myList.add("San Diego");
		myList.add("ATL");
		myList.add("London");
		myList.add("Richmond");
		System.out.println(myList);
		
		//Contains Method
		System.out.println("Return boolean: "+myList.contains("London"));
		System.out.println();
		
		//indexOf Method
		System.out.println("Returns the index of the Element: "+myList.indexOf("ATL"));
		System.out.println();
		
		//get Method
		System.out.println("Returns the actual element of the given index: "+myList.get(1));
		System.out.println();
		
		//Size method
		System.out.println("Returns the length of the ArrayList: "+myList.size());
		System.out.println();
		
		//Remove method
		String removeElement = myList.remove(2);
		System.out.println("Removed element: "+removeElement);
		System.out.println(myList);
		
		//Clear method
		myList.clear();
		System.out.println("ArrayList after clear: "+myList);
		
		//Declare and initialize the ArrayList at one time
		List<String> listObj = Arrays.asList("Java","Python","JavaScript","Reacts");//Not dynamic created as an array
		System.out.println(listObj);
		
		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		System.out.println(intList);
		
		//***************************************************************************//
		//Iterating through ArrayList//
		
		ArrayList<String> names = new ArrayList();
		
		names.add("Jane");
		names.add("Bruce");
		names.add("Wayne");
		
		//Enhance for loop
		for(String name: names) {
			System.out.println(name);
		}
		System.out.println();
		
		
		//Iterator method for looping (iterating) through ArrayList
		//the iterator contains more functionality
		Iterator itr = names.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
