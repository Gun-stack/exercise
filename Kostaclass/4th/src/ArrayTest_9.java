
import java.util.Scanner;

public class ArrayTest_9 {
	public static void main(String[] args) {
		int[] sarr = { 1, 2, 3, 4, 5 };
		int[] darr = sarr.clone(); // deep copy
		darr[1] = 7;

		for (int i = 0; i < sarr.length; i++) {
			System.out.print(sarr[i]);
		}
		System.out.println();
		for (int i = 0; i < darr.length; i++) {
			System.out.print(darr[i]);
		}
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		String a = scanner.next();
		System.out.println(a);
	}

}
