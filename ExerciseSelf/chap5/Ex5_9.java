package chap5;

public class Ex5_9 {
	public static void main(String[] args) {
		char[][] star = { { '*', '*', ' ', ' ', ' ' }, { '*', '*', ' ', ' ', ' ' }, { '*', '*', '*', '*', '*' },
				{ '*', '*', '*', '*', '*' } };
		char[][] result = new char[star[0].length][star.length];
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < star.length; i++) { // 4
			for (int j = 0; j < star[0].length; j++) { // 5

				result[j][i] = star[star.length - i - 1][j]; // j행 가 앞으로 와야 함

			}
		}
		for (int i = 0; i < result.length; i++) { // 4
			for (int j = 0; j < result[i].length; j++) { // 3
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
}
