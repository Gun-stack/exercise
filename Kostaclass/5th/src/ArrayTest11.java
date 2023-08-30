
import java.util.Scanner;
//100미만정수
//입력받다 0이 입력되면 0제외
//그떄까지 입력된 정수 십의자리 각각 갯 수
//작은수부터 출력하는 프로그램을 작성 0 개인 숫자는 출력 x

public class ArrayTest11 {
	public static void main(String[] args) {
		int[] cnt = new int[10];
		Scanner sc = new Scanner(System.in);
		int idx1 = 0;
		System.out.println("100이하 정수 입력");

		while (true) {
			int input = sc.nextInt();
			if (input == 0) {
				break;
			}
			if (input < 100) {
				idx1 = input / 10;
				cnt[idx1]++;
			} else if (input >= 100 || input < 0) {
				System.out.println("다시 입력하세요");
			}

		}

		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] != 0) {
				System.out.println(i + " : " + cnt[i] + " 개 ");
			}
		}

		sc.close();

	}
}
