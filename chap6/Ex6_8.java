
class Playingcard{
	int kind;
	int num;
	static int width;
	static int height;
	
	Playingcard(int k,int n){
		kind =k;
		num =n;
	}
}

public class Ex6_8 {
	public static void main(String[] args) {  //args, card = LocalVarial
		Playingcard card = new Playingcard(1, 1);
		System.out.println(card.kind);
	}
}
