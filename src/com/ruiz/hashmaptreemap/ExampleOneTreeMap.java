package com.ruiz.hashmaptreemap;

import java.util.TreeMap;

public class ExampleOneTreeMap {

	public static void main(String[] args) {
//		remove(key) - returns and removes the entry associated with the specified key from a TreeMap.
//		remove(key, value) - removes the entry from the map only if the specified key is associated with
//		the specified value and returns a boolean value.
		TreeMap<String,Integer> numbers = new TreeMap<>();
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		System.out.println("Original conents of TreeMap numbers: "+numbers);
		
		//remove method with single parameter
		int value = numbers.remove("Two");
		System.out.println("Removed value: "+value);
		
		//remove method with two parameters
		boolean result = numbers.remove("Three", 3);
		System.out.println("Is the entry {Three:3} removed? "+result);
		System.out.println("Updated TreeMap: "+numbers);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println();
        System.out.println("TreeMap: " + numbers);


        ///------------------Example 2-------------------
        //Using the firstkey() method
        String firstKey = numbers.firstKey();
        System.out.println("First key: "+firstKey);
        String lastKey = numbers.lastKey();
        System.out.println("Last key: "+lastKey);
        
        //using firstEntry() method
        System.out.println("First entry of TreeMap numbers: "+numbers.firstEntry());
        //using lastEntry() method
        System.out.println("Last entry of TreeMap numbers: "+numbers.lastEntry());
        
        
        

	}

}
