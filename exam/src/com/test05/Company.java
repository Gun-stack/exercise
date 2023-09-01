package com.test05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Company {
	public static void main(String[] args) {
		HashMap<Integer, Employee> map = new HashMap<>();
		
		map.put(1, new Seceretary("홍길동",1,"Seceretary",800));
		map.put(2, new Sales("이순신",2,"Sales",1200));

		for ( Integer k :map.keySet()) { 
			System.out.println(String.format();
		}
	}
}
