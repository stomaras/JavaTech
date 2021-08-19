package com.tom;

public class Student 
{
	/*
	 * Whenever you want to use JSP or whenever you want to use any object 
	 * you have to make sure you are using beans to make a bean you need getters 
	 * and setters, is the only way to get the properties here.
	 * 
	 */
	int rollno;
	String name;
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}

}
