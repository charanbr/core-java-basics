package com.project.laptop;

public class Details {
	
	int ordernumber;
	long code;
	String Nameofdevice;
	int Ram;
	int Rom;
	public Details() {
		super();
		
	}
	public Details(int ordernumber, long code, String nameofdevice, int ram, int rom) {
		super();
		this.ordernumber = ordernumber;
		this.code = code;
		Nameofdevice = nameofdevice;
		Ram = ram;
		Rom = rom;
	}
	@Override
	public String toString() {
		return "Details [ordernumber=" + ordernumber + ", code=" + code + ", Nameofdevice=" + Nameofdevice + ", Ram="
				+ Ram + ", Rom=" + Rom + "]";
	}
	

}
