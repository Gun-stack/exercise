package chap5;

import java.util.Scanner;

public class Ex5_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sel = 0;
		int money = 0;
		String[] menu = { "아메리카노", "카페라떼", "카푸치노", "에스프레소", "카페모카" };
		int[] coins = { 5000, 1000, 500, 100 };
		int[] price = { 1500, 2500, 2500, 2000, 3000 };
		int[] order = new int[10];
		int ordcnt = 0;
		int pricetot = 0;
		int[] span;
		span = new int[4];
		while (true) {
			money = 0;
			System.out.println("[코스타 카페]");
			for (int i = 0; i < menu.length; i++) {
				System.out.println((i + 1) + ". " + menu[i] + "(" + price[i] + "원)");
			}
			System.out.println(" 0. 주문  ");
			System.out.print("선택> ");
			sel = sc.nextInt();
			if (0 < sel && sel < 6) {
				order[ordcnt++] = sel;
				for (int i = 0; i < ordcnt; i++) {
					System.out.println(order[i] + " . " + menu[sel - 1] + " (" + price[sel - 1] + ") ");
				}
				pricetot += price[sel - 1];
				System.out.println("음료 " + ordcnt + "잔 결제 가격 : " + pricetot);
			}

			else if (sel == 0) {
				System.out.println("음료 " + ordcnt + "잔 결제가격은 총 " + pricetot + "입니다.");
				System.out.print("돈을 넣으세요> ");
				money = sc.nextInt();
				if (money < pricetot) {
					System.out.println((pricetot - money) + "원이 부족합니다");
				} else if (money == pricetot) {
					System.out.println(" 음료가 준비됩니다.");
					System.out.println("음료 " + ordcnt + "잔 결제 가격 : " + pricetot);
				}

				else {
					for (int i = 0; i < coins.length; i++) {
						span[i] = (money - pricetot) / coins[i];
						if (((money - pricetot) - coins[i] * span[i]) <= 0)
							break;
					}
					for (int i = 0; i < span.length; i++) {
						if (span[i] != 0) {

							System.out.println("총 : " + pricetot);
							System.out.println(
									"잔돈은 " + coins[i] + "원 " + span[i] + "개 총 " + (money - pricetot) + "원 입니다");
						}

					}

				}

			}

		
		} // while

	}// main
}

//1. 입금이 가격보다 작음 = 돈부족
//2 잔돈 500(1) ...동전(갯수)
