package com.test05;

public abstract class Employee {

	String name;
	int number;
	String department;
	int salary;
	
	public Employee() {
	}

	public Employee(String name,int number, String department, int salary) {
		this.name = name;
		this. number = number;
		this.department = department;
		this.salary = salary;
	}
	public abstract void tax();
	@Override
	public String toString() {
		return String.format(department, null)
	}
}
