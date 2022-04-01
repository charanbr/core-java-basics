package com.project.practice;

public class SwitchStatement {
	public static void main(String[]args) {
		String bikecc="100cc";
		
		switch(bikecc) {
		case "100cc":
			
			System.out.println("In long drive give the brek once ofter complition of 60km");
			break;
		case "150cc":
			System.out.println("In this you can drive maximum 130km without giving the break");
			break;
		case "220cc":
			System.out.println("this bike you can drive 200km to 300km with out stop");
			break;
			
		default:
			System.out.println("Please mention your bike engine CC");
		}
	}	
}
