package com.project.fan;

public class Fan {
	
	String Name;
	int Cost;
	long RPM;
	public Fan() {
		super();
	}
	public Fan(String name, int cost, long rPM) {
		super();
		Name = name;
		Cost = cost;
		RPM = rPM;
	}
	@Override
	public String toString() {
		return "Fan [Name=" + Name + ", Cost=" + Cost + ", RPM=" + RPM + "]";
	}
	
}
