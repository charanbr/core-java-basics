package com.project.constructor;

public class Tester {
	public static void main(String[] args) {
		Bike bike=new Bike("pulser");
		System.out.println(bike);
		
		Bike bike1=new Bike("Apache", 150);
		System.out.println(bike1);
		
		Bike bike2=new Bike("Bullet", 350, 40);
		System.out.println(bike2);
		
		Bike bike3=new Bike("Honda", 100, 60, 25645l);
		System.out.println(bike3);
		
		Bike bike4=new Bike("Hero", 120, 70, 2548l, "Red");
		System.out.println(bike4);
		
		Bike bike5=new Bike("Kawasaki", 110, 80, 2546l, "Blue", true);
		System.out.println(bike5);
	}
}

