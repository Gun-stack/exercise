
public class ArrayTest_13 {
	public static void main(String[] args) {
//		int[][] arr = new int[5][5];
//		for (int j = 0; j < arr[0].length; j++) {
//			arr[0][j] = 1;
//		}
//		for (int i = 1; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				arr[i][j] = arr[i - 1][j];
//				if (j - 1 >= 0) {
//					arr[i][j] += arr[i][j - 1];
//				}
//			}
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println();
//			for (int j = 0; j < arr.length; j++) {
//				System.out.printf("%3d", arr[i][j]);
//			}
//		}

		int[][] arr = new int[5][6];
		for (int j = 0; j < arr[0].length; j++) {
			arr[0][j] = 1;
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			for (int j = 1; j < arr[0].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
		}
	}
}
