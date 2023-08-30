
public class ArrayTest_6 {
	public static void main(String[] args) {
		int[][] narr = { { 10, 20, 30, 40 },
						{ 50, 60, 70, 80 }, 
						{ 90, 100, 110, 120 } };

		int[][] result = new int[narr.length + 1][narr[0].length + 1];

		for (int i = 0; i < narr.length; i++) {
			for (int j = 0; j < narr[0].length; j++) {
				result[i][j] = narr[i][j];
				
				System.out.println(result[i].length);//5
				
				result[i][result[i].length - 1] += narr[i][j];
				
				result[result.length-1][j] += narr[i][j];
				
				result[result.length-1][result[i].length - 1] += narr[i][j]; 
			}
			
		}

		for (int i = 0; i < result.length; i++) {
			System.out.println();
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + "\t");

			}

		}
		System.out.println(result[1][2]);
		
	}
}