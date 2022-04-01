
package com.project.practice;

public class SwitchStatement {
	public static void main(String[] args) {
		String trafficsSignal="Yellow";
		
		switch(trafficsSignal) {
		case "Red":
			System.out.println("Please stop the vehicle");
			break;
		case "Yellow":
			System.out.println("Ready to go....");
			break;
		case "Green":
			System.out.println("You can move freely");
			break;
			default:
				System.out.println("Input is invalid,,,,,,,please check the data");
		}
	}

}
