
import java.util.Scanner;

//데이터수 5 95 100 85 77 60
//
//60 75 85 95 100
//
public class ArraySort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 데이터 수 : ");
		int data = sc.nextInt();
		int tmp = 0;
		int[] arr = new int[data];
		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			System.out.print("데이터 입력 : ");
			int data1 = sc.nextInt();
			arr[i] = data1;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
