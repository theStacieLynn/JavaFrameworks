package com.ruiz.hashset.treesetprocessing;

import java.util.HashSet;

public class RemoveAll {

	public static void main(String[] args) {
		//Example 3
		HashSet<Integer> primeNumbers= new HashSet<Integer>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);
		System.out.println("HashSet1: "+primeNumbers);
		
		HashSet<Integer> oddNumbers = new HashSet<>();
		oddNumbers.add(1);
		oddNumbers.add(3);
		oddNumbers.add(5);
		System.out.println("HashSet2: "+oddNumbers);
		
		//Difference between HashSet1 and HashSet
		primeNumbers.removeAll(oddNumbers);
		System.out.println("Difference: "+primeNumbers);

	}

}
