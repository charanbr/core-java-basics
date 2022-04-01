package com.project.bag;

public class Bag {
	
	int Number;
	String Name;
	String Companyname;
	long Dimensions;
	public Bag() {
		super();
		
	}
	public Bag(int number, String name) {
		super();
		Number = number;
		Name = name;
	}
	public Bag(int number, String name, String companyname, long dimensions) {
		super();
		Number = number;
		Name = name;
		Companyname = companyname;
		Dimensions = dimensions;
	}
	@Override
	public String toString() {
		return "Bag [Number=" + Number + ", Name=" + Name + ", Companyname=" + Companyname + ", Dimensions="
				+ Dimensions + "]";
	}
	
	
	

}
