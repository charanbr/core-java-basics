package com.project.policemen;

public class PhysicalTesting {
	public static void main(String[] args) {
		Physical men=new Physical("Charan");
		System.out.println(men);
	
		Physical men1=new Physical("charan br",4);
		System.out.println(men1);
		
		Physical men2 = new Physical("charan chiru", 5, 123456l);
		System.out.println(men2);
		
		Physical men3 = new Physical("charan reddy", 6, 636363636l, true);
		System.out.println(men3);
		
		Physical men4 = new Physical("chiru", 5, 636152264l, false);
		System.out.println(men4);
		
	}

}
