package com.test06.entity;

public class VendinMachineBiz implements IVendingBachineBiz {
	int balance = 1000;
	Drink[] cartList = new Drink[3];
	int count = 0;

	@Override
	public void cartDrink(Drink drink) {

		if (balance < drink.price) {
			System.out.println("잔액이 부족하여 " + drink + " 구매 불가능합니다.");
		} else {
			balance -= drink.getPrice();
			if (count == cartList.length) {
				Drink[] cart2 = new Drink[cartList.length * 2];
				System.arraycopy(cartList, 0, cart2, 0, cartList.length);
				cartList = cart2;
			}
			cartList[count++] = drink;
			System.out.print(""+drink + "를 구입했습니다. ");
			System.out.println("현재 잔액: " + balance + "원");
		}
	}

	@Override
	public void printCart() {
		int coffeeCnt = 0;
		int juiceCnt = 0;
		int cokeCnt = 0;
		int totP = 0;
		for (int i = 0; i < count; i++) {
			/*switch (cartList[i].price) {
			case 100:
				coffeeCnt++;
				break;
			case 200:
				juiceCnt++;
				break;
			case 50:
				cokeCnt++;
				break;
			}*/
			
			
			if(cartList[i]instanceof Coffee)
			{coffeeCnt++;}
			else if(cartList[i] instanceof Juice) {
				juiceCnt++;
			}else if(cartList[i] instanceof Coke) {
				cokeCnt++;
			}
			
			totP += cartList[i].getPrice();
		}
		if (coffeeCnt>0) {
			System.out.println("커피 : "+ coffeeCnt +"개");
		}
		if (juiceCnt>0) {
			System.out.println("주스 : "+ juiceCnt +"개");
		}
		if (cokeCnt>0) {
			System.out.println("콜라 : "+ cokeCnt +"개");
		}
		System.out.println("====================");
		System.out.println("사용 금액 : " +totP );
		System.out.println("남은 금액 : " + balance);
	}

	@Override
	public void printDrinkList() {
		System.out.println("음료수명    가격");
		System.out.println("============");
		System.out.println("커피     100원");
		System.out.println("주스     200원");
		System.out.println("콜라      50원");
		System.out.println("============");
		System.out.println("현재 잔액: " + balance);
		
	}

}
