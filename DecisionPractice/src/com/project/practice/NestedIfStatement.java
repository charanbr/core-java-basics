package com.project.practice;

public class NestedIfStatement {
	public static void main(String[]args) {
		boolean haveyourLand=true;
		boolean haveyourCurrentBankAccount=true;
		long MonthlyIncome=500001l;
		
		
		if(haveyourLand) {
			if(haveyourCurrentBankAccount) {
				if(MonthlyIncome>500000)
				{
					System.out.println("Congratus Your Eligible For Our DealerShip");
				}
				else {
					System.out.println("plese increase your income as required minimum limit");
				}
				
			}
			else {
				System.out.println("Go and visit as your nearest bank and open your Currentbank Account");
			}
		}
		else {
			System.out.println("Sorry your not eligible because it is required as owne land");
		}
	}

}
