
class Sutda{
	int num;
	boolean iskwang ;
	String info() {
		return num+(iskwang? "k":" ");	
	}
}

public class SutdaCard {
	public static void main(String[] args) {
			Sutda card1 = new Sutda() ;
			card1.num =3;
			card1.iskwang = false;
			Sutda card2 = new Sutda();
			card2.num=1;
			card2.iskwang = true;
			
			System.out.println(card1.info());
			System.out.println(card2.info());
				
	}
}
