package chap5;

public class Ex5_6 {
	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		
		System.out.println("money="+money);
		
		
		int[] usedCoin = new int[coinUnit.length] ;
		
		for(int i=0;i<coinUnit.length;i++) {
			
			usedCoin[i] = money/coinUnit[i];
			money %=coinUnit[i]; 
		}
		
		for(int i=0; i<usedCoin.length;i++) {
			System.out.println(coinUnit[i]+"원 : "+usedCoin[i]);
		}
		
			
		
		
	
	}
}
