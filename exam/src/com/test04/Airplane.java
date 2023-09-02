package com.test04;

public class Airplane extends Plane  {
	public Airplane() {
	}
	public Airplane(String planeName, int fuelSize) {
		super(planeName,fuelSize);
	}
	@Override
	public void flight(int distance) {
		fuelSize -= distance*3;
		System.out.println(""+distance+" 운항 ");
	}
	
	
}
