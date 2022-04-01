package com.project.practice;

public class IfElseIfLadder {
		public static void main(String[] args) {
			boolean haveyourLaptop=false;
			boolean haveWiFi=false;
			
			if(haveyourLaptop) {
				System.out.println("Your eligible for applying this Job");
			}
			else if(haveWiFi) {
				System.out.println("Ok please maintain the good internet connection");
			}
			else {
				System.out.println("sorry please arriange the required accessories as this Work.......");
			}
			
		}
}
