package com.ruiz.hashmaptreemap;

import java.util.HashMap;

public class ExTwoHashMap {

	public static void main(String[] args) {
		HashMap<String,String> newHm = new HashMap<>();
		newHm.put("Key1","Lenovo");
		newHm.put("Key2", "Motorola");
		newHm.put("Key3", "Nokia");
		newHm.put("Key4", null);
		newHm.put(null, "Sony");
		System.out.println("Original map contains: "+newHm);
		
		//getting the size of the map
		System.out.println("Size of the orignal map is "+newHm.size());
		//copy contents of one HashMap to another
		HashMap<String,String> copyHm = new HashMap<>();
		copyHm.putAll(newHm);
		System.out.println("CopyHm mappings are: "+copyHm);
		
		//removal of null key
		String nullKeyValue = copyHm.remove(null);
		System.out.println("copyHm HashMap null key value "+nullKeyValue);
		System.out.println("Size of copyHm: "+copyHm.size());
		
		
		
		
	}

}
