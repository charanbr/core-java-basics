/*package com.project.practice;
public class IfElseIfLadder {
	public static void main(String[] args) {
		boolean haveAdharCard=false;
		boolean havePanCard=false;
		
		if(haveAdharCard) {
			System.out.println("you are the citizen of india");
		}
		else if(havePanCard) {
			System.out.println("you are eligible for the applying bank account");
		}
		else {
			System.out.println("Invalid data.........");
		}
	}
}	*/

package com.project.practice;
public class IfElseIfLadder {
	public static void main(String[] args) {
		boolean HaveAdharCard=false;
		boolean HavePanCard=true;
		
		if(HaveAdharCard) {
			System.out.println("You are citizen of India");
		}
		else if (HavePanCard) {
			System.out.println("You are eligible for applying the bank account");
		}
		else	{
			System.out.println("Invalid The data it is mismatch");
		}
	}
}