package com.test05;

public class Seceretary extends Employee {
	public Seceretary() {
	}
	public Seceretary(String name,int number, String department, int salary) {
		super(name,number,department,salary);
		
	}
	@Override
	public void tax() {
		salary *= 0.1;
	}
	
	public void incentive(int pay) {
		salary += (pay*0.8);
		
	}
	
}
