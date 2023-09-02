package com.test03;

import java.util.StringTokenizer;

public class TestMain03 {
	public static void main(String[] args) {

		String str = "1.22,4.12,5.93,8.71,9.34";
		float tot = 0;
		double avg = 0;
		int count = 0;

		StringTokenizer list = new StringTokenizer(str, ",");

		while (list.hasMoreTokens()) {
			tot += Double.parseDouble(list.nextToken());
			count++;
		}
		avg = tot / count;
		System.out.println(tot);
		System.out.printf("%.3f", tot);
		System.out.println();
		System.out.printf("%.3f", avg);
	}
}
