
import java.util.Scanner;
// 크기 7
// 1
//11
//101
//1001
//10001

public class ArrayTest_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행렬 크기 : ");
		int size = sc.nextInt();
		int[][] matrix = new int[size][size];
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][0] = 1;
			matrix[i][i] = 1;
		}
		for (int i = 2; i < matrix.length; i++) {
			for (int j = 1; j < i; j++) {
				matrix[i][j] = matrix[i - 1][j] + matrix[i - 1][j - 1];
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.printf("%4d", matrix[i][j]);
			}
			System.out.println();
		}

	}
}
