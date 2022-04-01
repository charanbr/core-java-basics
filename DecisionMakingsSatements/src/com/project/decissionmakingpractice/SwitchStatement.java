package com.project.decissionmakingpractice;

public class SwitchStatement {
	
	public static void main(String[] args) {
		String trafficsSignal="Red";
		
		switch(trafficsSignal) {
		case "Red":
			System.out.println("pleaseSTOP");
			break;
		case "Yellow":
			System.out.println("Ready to GO");
			break;
		case "Green":
			System.out.println("You can MOVE");
			break;
			default:
				System.out.println("GIVE THE INPUT");
		}

	}

}

