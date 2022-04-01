/*package com.project.practice;
public class NestedIfStatement {
	public static void main(String[] args) {
		boolean haveBankAccount=true;
		boolean haveMinumiumBank=true;
		int Salary=9000;
		if(haveBankAccount) {
			if(haveMinumiumBank) {
				if(Salary>10000) {
					System.out.println("You are eligible for applying a creditcard");
				}
				else {
					System.out.println("sorry,,,,you are not having a salary greater than 10000");
				}
			}
			else {
				System.out.println("you are not maintaining a minimum balance");
			}
		}
		else {
			System.out.println("Please apply for the bank account");
		}
	}
}*/
package com.project.practice;
public class NestedIfStatement {
	public static void main(String[] args) {
		boolean HaveBankAccount=true;
		boolean HaveMinimumBalance=false;
		int Salary=9999;
		if(HaveBankAccount) {
			if(HaveMinimumBalance) {
				if(Salary<10000) {
					System.out.println("Your eligible apply for the Cridict card");
				}
				else	{
					System.out.println("Sorry you are not having lesser the 10000Rs");
				}
			}
			else	{
				System.out.println("Sorry your not having minimum balence");
			}
		}
		else	{
			System.out.println("Apply for the bank Account");
		}
	}
}
