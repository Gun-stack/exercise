package com.test05;

public class Seceretary extends Employee {
	public Seceretary() {
	}

	public Seceretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);

	}

	public void incentive(int pay) {
		setSalary(getSalary() + (int) (pay * 0.8));

	}

}
