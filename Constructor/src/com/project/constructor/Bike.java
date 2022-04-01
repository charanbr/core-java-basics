package com.project.constructor;

public class Bike {
	String bikename ;
	int CC;
	int mileage;
	long bikenumber;
	String color;
	boolean isbikeworking;
	
	public Bike() {
		
	}

	public Bike(String bikename) {
		super();
		this.bikename = bikename;
	}

	public Bike(String bikename, int cC) {
		super();
		this.bikename = bikename;
		CC = cC;
	}

	public Bike(String bikename, int cC, int mileage) {
		super();
		this.bikename = bikename;
		CC = cC;
		this.mileage = mileage;
	}

	public Bike(String bikename, int cC, int mileage, long bikenumber) {
		super();
		this.bikename = bikename;
		CC = cC;
		this.mileage = mileage;
		this.bikenumber = bikenumber;
	}

	public Bike(String bikename, int cC, int mileage, long bikenumber, String color) {
		super();
		this.bikename = bikename;
		CC = cC;
		this.mileage = mileage;
		this.bikenumber = bikenumber;
		this.color = color;
	}

	public Bike(String bikename, int cC, int mileage, long bikenumber, String color, boolean isbikeworking) {
		super();
		this.bikename = bikename;
		CC = cC;
		this.mileage = mileage;
		this.bikenumber = bikenumber;
		this.color = color;
		this.isbikeworking = isbikeworking;
	}

	@Override
	public String toString() {
		return "Bike [bikename=" + bikename + ", CC=" + CC + ", mileage=" + mileage + ", bikenumber=" + bikenumber
				+ ", color=" + color + ", isbikeworking=" + isbikeworking + "]";
	}
}


