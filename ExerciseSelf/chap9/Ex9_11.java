package chap9;

public class Ex9_11 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int max = Math.max(n, m);
		int min = Math.min(n, m);
		
		
		
		
		for (int i = min; i <= max; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"x"+j+" = "+(i*j));
			}	
			System.out.println();
		}
		
		
	}
	
	
}
