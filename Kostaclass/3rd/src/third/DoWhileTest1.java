package third;

import java.util.Scanner;

public class DoWhileTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0 ;
		int in;
//		do {
//			in = sc.nextInt();
//			sum += in;
//		} while (in!=0);
//		System.out.println(sum);
		
		in = sc.nextInt();
		while (in!=0) {
			sum+=in;
			in = sc.nextInt();
		}
		System.out.println(sum);
	
	}
}
