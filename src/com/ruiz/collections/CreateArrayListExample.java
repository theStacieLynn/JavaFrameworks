package com.ruiz.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
		
		//retrieve an element at a given index
		String bestCompany = topCompanies.get(0);
		String secondBest = topCompanies.get(1);
		String lastCompany = topCompanies.get(topCompanies.size()-1);
		System.out.println(bestCompany);
		System.out.println(secondBest);
		System.out.println(lastCompany);
		System.out.println();
		
		//modify an element at a given index
		topCompanies.set(4, "Walmart");
		System.out.println("Modified top companies list: "+topCompanies);
		System.out.println();
	
		/****************Example 4*****************/
		/********Removing Elements from an ArrayList*********/
		
		List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: " + programmingLanguages);
        System.out.println();
        //Remove element at index 5
        programmingLanguages.remove(5);
        System.out.println("After removing element at index 5: "+programmingLanguages);
        System.out.println();
        // Remove the first occurrence of the given element from the ArrayList
        // (The remove() method returns false if the element does not exist in the ArrayList)
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"): " + isRemoved);
        
        //Remove all the elements the exist in a given collection
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");
        
        //remove scriptingLanguages from programming languages
        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): "+programmingLanguages);
        //Romove all elements from ArrayList
        programmingLanguages.clear();
        System.out.println("After clear(): "+programmingLanguages);
        System.out.println();
        
		/****************Example 5*****************/
		/********Iterating Elements from an ArrayList*********/
        
        List<String> tvShows =new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game of Thrones");
        tvShows.add("Friends");
        tvShows.add("Avatar the Last Air Bender");
        tvShows.add("How I met your mother");
        System.out.println("\n=== Iterate using an iterator() ===");
        
        Iterator<String> tvShowIterator = tvShows.iterator();
        while(tvShowIterator.hasNext()) {
        	String tvShow = tvShowIterator.next();
        	System.out.println(tvShows);
        }
        System.out.println("==Iterate using an iterator() and forEachRemaining() method ===");
        tvShowIterator = tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow -> {
           System.out.println(tvShow);
        });
        System.out.println("\n=== Iterate using simple for-each loop ===");
        for(String tvShow: tvShows) {
           System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using for loop with index ===");
        for(int i = 0; i < tvShows.size(); i++) {
        	System.out.println(tvShows.get(i));
        }
        
        
        System.out.println("\n=== Iterate iterator ===");
        ListIterator<String> iterator = tvShows.listIterator();
        System.out.println("Elements in forward direction");

        System.out.println("\n====== Iterate using while loop=======");

        while (iterator.hasNext())
        {
           System.out.println(iterator.next());
        }

        System.out.println("=========Elements in backward direction======");

        while (iterator.hasPrevious())
        {
           System.out.println(iterator.previous());
        }
        /****************Example 6*****************/
		/********Searching for Elements in an ArrayList*********/
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");
        
     // Check if an ArrayList contains a given element
        System.out.println("Does names array contain \"Bob\"? : " + names.contains("Bob"));
        
     // Find the index of the first occurrence of an element in an ArrayList
        System.out.println("indexOf \"Steve\": " + names.indexOf("Steve"));
        System.out.println("indexOf \"Mark\": " + names.indexOf("Mark"));

      // Find the index of the last occurrence of an element in an ArrayList
        System.out.println("lastIndexOf \"John\" : " + names.lastIndexOf("John"));
        System.out.println("lastIndexOf \"Bill\" : " + names.lastIndexOf("Bill"));

	}
	
}
