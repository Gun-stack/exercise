package third;

public class ContinueTest1 {
	public static void main(String[] args) {
		int sum = 0;
//		for (int i = 0; i <= 100; i++) {
//			if (i%4==0 || i%7==0) continue;{sum +=i;
//			}System.out.println(sum);
//		}
//		System.out.println(sum);
		sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i%4!=0 && i%7!=0) {sum +=i;
			}System.out.println(sum);
		}
		System.out.println(sum);
	}
}
