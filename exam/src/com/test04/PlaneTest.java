package com.test04;

import java.util.ArrayList;

public class PlaneTest {
	
	
	
	
	public static void main(String[] args) { 
		Plane a = new Airplane("L777",1000);
		Plane c = new Cargoplane("C50",1000);
		
		
		System.out.println();
		System.out.println("plaen fuelsize");
		System.out.println("---------------");

		a.info();
		c.info();
		
		a.flight(100);
		c.flight(100);
		System.out.println();
		System.out.println("plaen fuelsize");
		System.out.println("---------------");
		a.info();
		c.info();
		
		a.refuel(200);
		c.refuel(200);
		System.out.println();
		System.out.println("plaen fuelsize");
		System.out.println("---------------");
		a.info();
		c.info();
	}
}
