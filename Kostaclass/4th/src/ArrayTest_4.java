
public class ArrayTest_4 { 
	public static void main(String[] args) {
		int[][] narr = {	{ 10, 20, 30, 40 },
							{ 50, 60, 70, 80 }, 
							{ 90, 100, 110, 120 } };
//2차원 배열 전체합
		int sum = 0;
		int al1 = narr.length;
		
		
		for (int i = 0; i < al1; i++) {
			int al2 = narr[i].length;	
//			System.out.println(al1);
//			System.out.println(al2);

			for (int j = 0; j < al2; j++) {
				sum += narr[i][j];
			}
		}
		System.out.println(sum);
	}
}
