package com.test04;

import java.util.ArrayList;

public class PlaneTest {
	
	
	
	
	public static void main(String[] args) { 
		Plane a = new Airplane("L777",1000);
		Plane c = new Cargoplane("C50",1000);
		
		a.info();
		a.flight(100);
		a.info();
		a.refuel(200);
		a.info();
	}
}
