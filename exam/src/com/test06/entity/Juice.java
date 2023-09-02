package com.test06.entity;

public class Juice extends Drink{
public Juice() {
	price = 200;
}
@Override
	public String toString() {
		return "쥬스"+super.toString();
	}
}
