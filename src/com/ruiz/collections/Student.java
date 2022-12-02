package com.ruiz.collections;

public class Student {
	private String name;
	private String major;
	private int gradDate;
	
	public Student() {
		name = "";
		major="";
		
	}

	public Student(String name, String major, int gradDate) {
		super();
		this.name = name;
		this.major = major;
		this.gradDate = gradDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGradDate() {
		return gradDate;
	}

	public void setGradDate(int gradDate) {
		this.gradDate = gradDate;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", major=" + major + ", gradDate=" + gradDate + "]";
	}
	
}
