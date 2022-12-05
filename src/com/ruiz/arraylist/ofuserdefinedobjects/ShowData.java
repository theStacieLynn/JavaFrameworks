package com.ruiz.arraylist.ofuserdefinedobjects;

import java.util.ArrayList;

public class ShowData {

	public static void main(String[] args) {
		//instantiation to AddDataToArrayList
		AddDataToArrayList b = new AddDataToArrayList();
		
		ArrayList<Book> myBookList = b.bookDetails();
		//enhanced for loop
		for(Book showValue: myBookList) {
			 // ---- invoking getter method for geting Data--------- 
			System.out.println(showValue.getNumber()+" "+showValue.getName()+" "+showValue.getCategory()+" "+
			 showValue.getAuthor());
		}

	}

}
