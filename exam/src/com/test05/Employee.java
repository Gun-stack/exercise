package com.test05;

public abstract class Employee {

	String name;
	int number;
	String department;
	int salary;

	public Employee() {
	}

	public Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double tax() {
		return salary * 0.1;
	}

	public abstract void incentive(int pay);

	@Override
	public String toString() {
		return name + " " + department + " " + salary;
	}
}
