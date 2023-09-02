package com.test06.entity;

import java.util.Scanner;

public class VendingMachineTest {
	
	public static void printMenu() {
		System.out.println("===========================");
		System.out.println("[음료수 자판기 관리 시스템] ");
		System.out.println("===========================");
		System.out.println("1.전체 음료수 및 잔액 보기");
		System.out.println("2.쥬스 구입하기 ( 200원 )");
		System.out.println("3.커피 구입하기 ( 100원 )");
		System.out.println("4.코크 구입하기 ( 50원 )");
		System.out.println("5.구입한 음료수 목록 보기");
		System.out.println("9.종료");
		System.out.println("===========================");
	}
	
	public static void main(String[] args) {

		VendinMachineBiz vm = new VendinMachineBiz();
		Scanner sc = new Scanner(System.in);

		while (true) {
			printMenu();
			System.out.print("메뉴 입력 => ");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				vm.printDrinkList();
				break;
			case 2:
				vm.cartDrink(new Juice());
				break;
			case 3:
				vm.cartDrink(new Coffee());
				break;
			case 4:
				vm.cartDrink(new Coke());
				break;
			case 5:
				vm.printCart();
				break;
			case 9:
				System.out.println("프로그램 종료");
				sc.close();
				return;
			default:
				System.out.println("메뉴값을 확인후 다시 입력하세요.");
			}
		}
	}

	

}
