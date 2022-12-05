package com.ruiz.arraylist.ofuserdefinedobjects;

import java.util.ArrayList;

public class AddDataToArrayList {
	public ArrayList<Book> bookDetails(){
		//User-Defined class objects in Java ArrayList
		
		
		ArrayList<Book> list = new ArrayList<Book>();
		//Passing data using constructors
		Book b1 = new Book(1,"Death Note","John","Cartoon");
		Book b2 = new Book(2,"Stranger Things","Brothers","Suspense");
		Book b3 = new Book(3,"Spider Man","Alex","Kids");
		Book b4 = new Book(4,"GentleMen","Max","Action");
		
		//Passing data using setter
		Book b5 = new Book();
		b5.setNumber(5);
		b5.setName("Java Full Stack");
		b5.setAuthor("Flex");
		b5.setCategory("Programming");
		
		//adding Book objects to ArrayList
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		return list;
		
	}

}
