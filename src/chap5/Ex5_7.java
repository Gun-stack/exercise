package chap5;

import java.util.Scanner;

public class Ex5_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			 // 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
			
			int money = in.nextInt();
			in.close();
			
			System.out.println("money="+money);
			int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
			int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
			
			 for (int i = 0; i < coinUnit.length; i++) {
		    
				 int coinNum = money / coinUnit[i]; // 1. 동전 개수 계산
		            
		            if (coinNum > coin[i]) {
		                coinNum = coin[i]; // 현재 보유한 동전 수만큼 사용
		            }
		            
		            coin[i] -= coinNum; // 동전 개수 감소
		            
		            money -= coinNum * coinUnit[i]; //  금액에서 동전 가치만큼 차감

		            System.out.println(coinUnit[i] + "원: " + coinNum);
		        }

			if(money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // 프로그램을 종료한다.
			}
			System.out.println("=남은 동전의 개수 =");
			for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원:"+coin[i]);
	}
	}
	}