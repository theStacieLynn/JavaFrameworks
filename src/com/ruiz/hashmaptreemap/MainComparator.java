package com.ruiz.hashmaptreemap;

import java.util.TreeMap;

public class MainComparator {

	public static void main(String[] args) {
		// Creating a TreeMap with a customized comparator
		TreeMap<String,Integer> number = new TreeMap<>(new CustomComparator());
		number.put("First", 1);
		number.put("Second", 2);
		number.put("Third", 3);
		number.put("Fourth", 4);
		System.out.println("TreeMap: "+number);
		
		

	}

}
