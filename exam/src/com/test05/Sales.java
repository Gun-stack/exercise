package com.test05;

public class Sales extends Employee implements Bonus{
	public Sales() {
	}
	public Sales(String name,int number, String department, int salary) {
		super(name,number,department,salary);
	}
	
	@Override
	public void tax() {
		salary *= 0.87;
	}
	@Override
	public void incentive(int pay) {
		salary += pay*1.2;
	}

}
