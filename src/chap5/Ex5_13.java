package chap5;

import java.util.Scanner;

public class Ex5_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sel = 0;
		int money = 0;
		int[] coins = { 5000, 1000, 500, 100 };
		int[] price = { 1500, 2500, 2500, 2000, 3000 };
		int pricetot = 0;
		int[] span;
		span = new int[4];
		while (true) {
			money = 0;
			System.out.println("[코스타 카페]");
			System.out.println(" 1. 아메리카노 (1500원) ");
			System.out.println(" 2. 카페라떼 (2500원) ");
			System.out.println(" 3. 카푸치노 (2500원) ");
			System.out.println(" 4. 에스프레소 (2000원) ");
			System.out.println(" 5. 카페모카 (3000원) ");
			System.out.println(" 0. 종료  ");
			System.out.print("선택> ");
			sel = sc.nextInt();
			if (sel == 0)
				break;

			pricetot = price[sel-1];
			System.out.println("가격은 총 " + pricetot + "입니다.");
			System.out.print("돈을 넣으세요> ");
			money = sc.nextInt();
			if (money < pricetot) {
				System.out.println((pricetot-money) + "원이 부족합니다");
			} else if (money == pricetot) {
				System.out.println(" 음료가 준비됩니다.");
			}

			else {

				for (int i = 0; i < coins.length; i++) {
					span[i] = (money - pricetot) / coins[i];
					if (((money - pricetot) - coins[i] * span[i]) <= 0)
						break;
				}
				for (int i = 0; i < span.length; i++) {
					if (span[i] != 0) {
						System.out.println("잔돈은 " + coins[i] + "원" + span[i] + "개 총 "+(money-pricetot) +"원 입니다");
					}

				}

			}
		}
		sc.close();
	}// main
}

//1. 입금이 가격보다 작음 = 돈부족
//2 잔돈 500(1) ...동전(갯수)
