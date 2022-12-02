package com.ruiz.collections;

import java.util.ArrayList;

public class StudentDriver {

	public static void main(String[] args) {
		//default constructor with user Defined object Student as data type
		ArrayList<Student> students = new ArrayList<>();
		Student s1 = new Student("Ruiz","CIS",2022);//satisfies student constructor with parameters
		Student s2 = new Student("Cajas","CIS",2030);
		Student s3 = new Student("Anastasia","CompSci",2040);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		System.out.println("Students ArrayList: "+students);
		
		//enhanced for loop
		System.out.println();
		//students is arrayList, student is created variable, Student is data type
		for(Student student: students) {
			System.out.println(student);
		}
		System.out.println();
		/*********************
		 * 
		 */
		ArrayList<Student> otherStudents = new ArrayList<Student>(5);
		otherStudents.add(null);
		otherStudents.add(null);
		
		//Student is data type(user define object), student is the created variable, otherStudents=ArrayList
		for(Student student: otherStudents) {
			System.out.println(student);
		}
		System.out.println(otherStudents.size());
	}

}
