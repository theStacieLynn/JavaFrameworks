package com.ruiz.collections;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
//	Key Points about ArrayList in Java:
//		An ArrayList is a resizable array, also called a dynamic array. 
//		It grows its size to accommodate new elements, and shrinks its size when the elements are removed.
//		An ArrayList internally uses an array to store the elements. Just like arrays, it allows you to retrieve the elements by index.
//		A Java ArrayList allows for duplicate and null values.
//		A Java ArrayList is an ordered collection, and maintains the insertion order of the elements.
//		You cannot create an ArrayList of primitive types such as int, char, etc.; you need to use boxed types such as Integer, Character, Boolean, etc.
//		A Java ArrayList is not synchronized. If multiple threads try to modify an ArrayList simultaneously, the final outcome will be non-deterministic. 
//		You must explicitly synchronize access to an ArrayList if multiple threads are going to modify it.
	
	public static void main(String[] args) {
		/****************Example One****************/
		//Creating an ArrayList of Strings and adding new elements
		List<String> animals = new ArrayList<>();
		
		//Adding new elements
		animals.add("Lion");
		animals.add("Tigers");
		animals.add("Bear");
		animals.add("Oh my");
		
		System.out.println(animals);
		
		//Add an element to a particular index
		animals.add(2, "Elephant");
		System.out.println(animals);
		System.out.println();
		
		/****************Example Two*****************/
		/********Creating an ArrayList from Another Collection**********/
		List<Integer> firstFiveParameters = new ArrayList<>();
		firstFiveParameters.add(13);
		firstFiveParameters.add(17);
		firstFiveParameters.add(19);
		firstFiveParameters.add(23);
		firstFiveParameters.add(29);
		
		//creating an array list from another collection
		List<Integer> firstTenParameters = new ArrayList<>(firstFiveParameters);
		
		List<Integer> nextFiveParameters = new ArrayList<>();
		nextFiveParameters.add(1);
		nextFiveParameters.add(3);
		nextFiveParameters.add(8);
		nextFiveParameters.add(9);
		nextFiveParameters.add(13);;
		
		firstTenParameters.addAll(nextFiveParameters);
		System.out.println(firstTenParameters);
		System.out.println();
		
		/****************Example Three*****************/
		/********Accessing Elements from an ArrayList*********/
		
//		This example shows:
//			The use of the isEmpty() method to check if an ArrayList is empty.
//			The use of the size() method to find the size of an ArrayList.
//			The use of the get() method to access an element at a particular index in an ArrayList.
//			The use of the set() method to modify the element at a particular index in an ArrayList.

		List<String> topCompanies = new ArrayList<>();
		//Check if an arrayList is empty
		System.out.println("Is the top companies ArrayList empty? "+topCompanies.isEmpty());
		
		topCompanies.add("Google");
		topCompanies.add("Microsoft");
		topCompanies.add("Amazon");
		topCompanies.add("Target");
		topCompanies.add("Meta");
		
		//find the size of an arrayList
		System.out.println("Here are the top "+topCompanies.size()+" companies in the world");
		System.out.println(topCompanies);
	}
	
}
