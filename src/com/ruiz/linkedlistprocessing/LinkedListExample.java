package com.ruiz.linkedlistprocessing;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {
//Coded by Stacie Ruiz
	
	public static void main(String[] args) {
		/*
		 * LinkedList declaration
		 */
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		//add (String element) is used for adding elements to the linked list
		linkedlist.add("Item1");
		linkedlist.add("Item5");
		linkedlist.add("Item3");
		linkedlist.add("Item6");
		linkedlist.add("Item2");
		
		//display linkedlist content
		System.out.println("Linked list content: "+linkedlist);
		System.out.println();
		
		//Add first and last element
		System.out.println("--------Add first and last element with .addFirst() and .addLast()--------");
		linkedlist.addFirst("First Item");
		linkedlist.addLast("Last Item");
		System.out.println(linkedlist);
		System.out.println();
		
		//how to get and set values
		System.out.println("-----Get and Set Values-----");
		Object firstVar = linkedlist.get(0);
		System.out.println("First element: "+firstVar);
		linkedlist.set(0, "Change First Item");
		Object firstVar2 = linkedlist.get(0);
		System.out.println("First element after updating list using .set(): "+firstVar2);
		System.out.println();
		
		//remove first and last element
		System.out.println("-----Remove First and last element----");
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("Linkedlist after deletion of first and last element: "+linkedlist);
		System.out.println();
		
		///Add to a position and remove from a position
		linkedlist.add(0,"Newly added item");
		linkedlist.remove(2);
		System.out.println("Final content: "+linkedlist);
		System.out.println();
		
		//LinkedList sort example
		System.out.println("-----LinkedList sort example-----");
		LinkedList<String> ll = new LinkedList<>();
		ll.add("A");
		ll.add("C");
		ll.add("B");
		ll.add("D");
		
		//unsorted list
		System.out.println("Unsorted list: "+ll);
		
		//Sort and display the list
		Collections.sort(ll);
		System.out.println("Sorted Linkedlist: "+ll);
		
		//Custom sorting
		Collections.sort(ll,Collections.reverseOrder());
		System.out.println("Custom sorting, reverseOrder() method "+ll);
		
		
		

	}

}
