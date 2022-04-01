/*package com.project.bus;

public class Tester {
	public static void main(String[] args) {
		Bus bus=new Bus();
		bus.Slno=1;
		bus.BusName="KSRTC";
		bus.BusColor="Red";
		bus.BusBrand="TATA";
		bus.BusCantactNumber=8548078524l;
		bus.canCarryPeoples();
		
		
		if(bus.Slno>0) {
			System.out.println("Sl no is valid");
			System.out.println(bus.Slno);
		}
		else {
			System.out.println("Invalid Sl no,,,please check it once");
		}
		if(bus.BusName!=null&&!bus.BusName.isEmpty()) {
			System.out.println("bus name is valid");
			System.out.println(bus.BusName);
		}
			else {
				System.out.println("bus name should not be empty and is not null");
			}
			
			
		}
		
		
//		System.out.println("Bus SlNo: "+bus.Slno);
//		System.out.println("Bus Name: "+bus.BusName);
//		System.out.println("Bus Color: "+bus.BusColor);
//		System.out.println("Bus Brand: "+bus.BusBrand);
//		System.out.println("Bus Cantact Number: "+bus.BusCantactNumber);
	}*/

package com.project.bus;

public class Tester {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		bus.Slno=1;
		bus.Busname="Ksrtc";
		bus.BusColor="Red";
		bus.BusCantactnumber=98979789l;
		bus.isworkinggood=true;
		
		System.out.println("Slo number of the bus : "+bus.Slno);
		System.out.println("Bus name as there mentioned : "+bus.Busname);
		System.out.println("Bus color as specified : "+bus.BusColor);
		System.out.println("Bus Cantact Number : "+bus.BusCantactnumber);
		System.out.println("Bus Horn is Working : "+bus.isworkinggood);
		
	}
	
}



