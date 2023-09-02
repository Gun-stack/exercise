package com.test06.entity;

public class Drink {
	int price;
	
	public Drink() {
	}
	public Drink(int price) {
	this.price = price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return ""; 
	}
}
