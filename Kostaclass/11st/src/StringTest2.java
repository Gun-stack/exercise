import java.awt.Point;
import java.nio.channels.Pipe;
import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {

		String str = "Good Luck";
		int idx = str.indexOf('L');
		System.out.println(idx);
		int idx2 = str.indexOf("Luck");
		System.out.println(idx2);

		String fruit = "apple,banna,pineapple,melon,strawberry";
		String[] fruitarr = fruit.split(",");
		for (int i = 0; i < fruitarr.length; i++) {
			System.out.println(fruitarr[i]);
		}
		
		int idx3 = fruit.indexOf("pineapple");
		
		System.out.println(idx3);
		
		int length3 = fruitarr[2].length();
		
		System.out.println(fruit.substring(idx3, idx3 + length3));

//		System.out.println("Y /N 선택");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		String answer = sc.nextLine();
//		if (answer.toLowerCase().equals("y")) {
//			System.out.println("yes 선택");
//		} else if (answer.toUpperCase().equals("N")) {
//			System.out.println("No 선택");
//		}

		String str1 = "  Hello world !!  ".trim() ;
		System.out.println(str1);
		Point point = new Point(10,20);
		int n = 100;
		String str2  = String.valueOf(point);
		System.out.println(str2);
		String str3 = ""+100;
		System.out.println(str3);
		
		
		
	}
}
