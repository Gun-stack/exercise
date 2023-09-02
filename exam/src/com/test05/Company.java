package com.test05;

import java.util.HashMap;
import java.util.Set;

public class Company {
	public static void main(String[] args) {
		HashMap<Integer, Employee> map = new HashMap<>();

		Seceretary sc1 = new Seceretary("홍길동", 1, "Secretary", 800);
		Sales sl2 = new Sales("이순신", 2, "Sales", 1200);

		map.put(sc1.getNumber(), sc1);
		map.put(sl2.getNumber(), sl2);

		Set<Integer> keys = map.keySet();
		System.out.println("name department salary");
		System.out.println("---------------------------");

		for (Integer key : keys) {
			Employee emp = map.get(key);
			System.out.println(emp);
		}
		System.out.println();

		for (Integer key : keys) {
			Employee emp = map.get(key);
			emp.incentive(100);
		}

		System.out.println("name department salary tax");
		System.out.println("---------------------------");
		for (Integer key : keys) {
			Employee emp = map.get(key);
			System.out.println("" + emp + "  " + emp.tax());
		}

	}

}
