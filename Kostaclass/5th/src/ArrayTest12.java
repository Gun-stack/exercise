import java.util.Scanner;

//3명의 국여수 점수, 총점 과목별 합계
//국  영   수   총
//   95 100 88   283
//   95 60 93    238
//   66 99 98    253
//   246 259 269 774
//평균 국 영 수 총
//
public class ArrayTest12 {
	public static void main(String[] args) {
		int[][] score = new int[4][4];
		String [] sub= {"국" , "영" , "수" };
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 0; j < score[0].length - 1; j++) {
				System.out.printf(" 학생%d의 "+sub[j]+" 점수 입력", i + 1 );
				int input = sc.nextInt();
				score[i][j] = input;
			}
		}
		sc.close();

		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 0; j < score[0].length - 1; j++) {
				score[i][score[0].length - 1] += score[i][j];
			}
		}
		for (int j = 0; j < score[0].length; j++) {
			for (int i = 0; i < score.length - 1; i++) {
				score[score.length - 1][j] += score[i][j];
			}
			score[score.length - 1][j] /= (float) score[0].length-1;
		}

		for (int i = 0; i < score.length; i++) {
			System.out.println();
			for (int j = 0; j < score[0].length; j++) {
				System.out.printf("%4d ", score[i][j]);
			}

		}

	}
}
