
import java.util.Scanner;



//데이터수 5 95 100 85 77 60
//최소, 최대

public class ArrayTest_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("데이타 수 : ");
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("데이터 입력");
			int data = sc.nextInt();
			arr[i] = data;
		}
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length ; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max = arr[i];
			}
		}

	
			System.out.printf("%3d   %3d", min, max);


	}
}
