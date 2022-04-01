package com.pro.mobile;

public class Mobile {
	
	
	int Slno;
	String name;
	long number;
	boolean isitworking;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(int slno, String name, long number, boolean isitworking) {
		super();
		Slno = slno;
		this.name = name;
		this.number = number;
		this.isitworking = isitworking;
	}
	@Override
	public String toString() {
		return "Mobile [Slno=" + Slno + ", name=" + name + ", number=" + number + ", isitworking=" + isitworking + "]";
	}
	

}
