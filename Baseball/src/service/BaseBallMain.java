package service;

import java.util.Scanner;

public class BaseBallMain {
	 public static void main(String[] args) {
		BaseBallservice bs= new BaseBallservice();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			bs.menu();
			int sel = sc.nextInt();
			
			switch (sel) {
			case 1:
				bs.regTeam();
				break;
			case 2:
				bs.viewTeam();
				break;
			case 3:
				bs.selectTeam();
			break;
			case 4:
				bs.regPlayer();
				break;
			case 5:
				bs.spName();
				break;
			case 6:
				bs.spBack();
				break;
			case 7:
				bs.spNum();
				break;
			case 8:
				bs.pot();
				break;
			case 0:
				System.out.println("종료");
				sc.close();
				return;
			default:
				System.out.println("메뉴값을 다시");
				
			}
		}
		 
	}
}
