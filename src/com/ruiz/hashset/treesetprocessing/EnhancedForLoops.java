package com.ruiz.hashset.treesetprocessing;

import java.util.HashSet;

public class EnhancedForLoops {

	public static void main(String[] args) {
		//Example 4
		//HashSet declaration
		HashSet<String> hset = new HashSet<String>();
		hset.add("Apple");
		hset.add("Orange");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Fig");
		//Addition of duplicate elements
		hset.add("Apple");
		hset.add("Mango");
		//Additional null values
		hset.add(null);
		hset.add(null);
		
		for(String str: hset) {
			System.out.println("------>"+str);
		}

	}

}
