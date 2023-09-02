package com.test04;

public abstract class Plane {
	String planeName;
	int fuelSize;

	public Plane() {
	}

	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	public String getPlaneName() {
		return planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void refuel(int fuel) {
		this.fuelSize += fuel;
		System.out.println("" + fuel + " 주유 ");
	}

	abstract public void flight(int distance);

	public void info() {
//		System.out.println("plane fuelSize");
//		System.out.println("---------------");
		System.out.println("" + getPlaneName() + "   " + getFuelSize());

	}

}
