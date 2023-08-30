package chpa7;


class SutdaDeck {
	private final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (int i = 0; i < CARD_NUM; i++) {

			boolean isKwang = (i + 1 == 1 || i + 1 == 3 || i + 1 == 8);

			cards[i] = new SutdaCard(1 + i % 10, isKwang);
		}
	}
	/*7-2*/
	void shuffle() {
		SutdaCard tmp;
		for (int i = 0; i < 1000; i++) {
			int r = (int)(Math.random()*CARD_NUM);
			int r2 = (int)(Math.random()*CARD_NUM);
			tmp = cards[r];
			cards[r] = cards[r2];
			cards[r2] = tmp;
			
		}
	}
	SutdaCard pick(int i) {
		return  cards[i];
	}
	SutdaCard pick() {
		int p = (int)(Math.random()*CARD_NUM);
		return cards[p];
	}
	


}

class SutdaCard {
	private int num;
	private	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class Ex7_14 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();
		
		/*7-2*/
		deck.shuffle();
		
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		
		System.out.println();
		
		System.out.println(deck.pick(0));
		
		
		System.out.print(deck.pick()+"  ");
		System.out.println(deck.pick());
		
		
	}
}
