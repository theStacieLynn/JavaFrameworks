package com.ruiz.collections;

public class BoxDriver {

	public static void main(String[] args) {
		// Create a generic instance for Box
		Box<Integer> intBox = new Box<Integer>();
		
		intBox.add(8);
		intBox.add(12);
		intBox.add(3);
		intBox.add(17);
		
		System.out.println(intBox.get());
		System.out.println();
		
		//float object
		Box<Float> floatBox = new Box<Float>();
		floatBox.add(123.4f);
		floatBox.add(18.5f);
		floatBox.add(1.2f);
		floatBox.add(3.4f);
		System.out.println(floatBox.get());
		System.out.println();
		
		

	}

}
