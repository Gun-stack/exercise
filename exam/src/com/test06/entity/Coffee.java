package com.test06.entity;

public class Coffee extends Drink {
	public Coffee() {
		price =100;
	}
	@Override
	public String toString() {
		return "커피" + super.toString() ;
	}
}
