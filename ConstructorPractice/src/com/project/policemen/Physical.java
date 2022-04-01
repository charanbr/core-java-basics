package com.project.policemen;

public class Physical {
		String Name;
		int Hight;
		long Aplicationnumber;
		boolean heisselect;
		
	public Physical()
	{
	}

	public Physical(String name) {
		super();
		Name= name;
	}

	public Physical(String name, int hight) {
		super();
		Name = name;
		Hight = hight;
	}

	public Physical(String name, int hight, long aplicationnumber) {
		super();
		Name = name;
		Hight = hight;
		Aplicationnumber = aplicationnumber;
	}

	public Physical(String name, int hight, long aplicationnumber, boolean heisselect) {
		super();
		Name = name;
		Hight = hight;
		Aplicationnumber = aplicationnumber;
		this.heisselect = heisselect;
	}

	@Override
	public String toString() {
		return "Physical [Name=" + Name + ", Hight=" + Hight + ", Aplicationnumber=" + Aplicationnumber
				+ ", heisselect=" + heisselect + "]";
	}
	
	
	
}
