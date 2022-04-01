package com.project.constructor;

public class Charger {
	
	int Slno;
	long Number;
	String name;
	public Charger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Charger(int slno, long number, String bagname) {
		super();
		Slno = slno;
		Number = number;
		name = bagname;
	}
	@Override
	public String toString() {
		return "Charger [Slno=" + Slno + ", Number=" + Number + ", Bagname=" + name + "]";
	}
	
}

