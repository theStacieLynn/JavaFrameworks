package com.ruiz.collections;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
	//Generic Class
	//Generic Box
	List<T> values;
	
	public Box() {
		values = new ArrayList<T>();
	}

	public void add(T value) {
		values.add(value);
	}
	//create a method that returns a list of T types
	public List<T> get(){
		return values;
	}
}
