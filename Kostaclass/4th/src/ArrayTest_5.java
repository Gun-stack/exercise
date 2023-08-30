public class ArrayTest_5 {
	public static void main(String[] args) {
		int[][] narr = {
				{10,20,30,40},
				{50,60,70,80},
				{90,100,110,120}
		};
		//행 다더해서 다음행에 넣기
		
		int[][] result = new int[narr.length][narr[0].length+1];
		
		for (int i = 0; i < narr.length; i++) {
			for (int j = 0; j < narr[0].length; j++) {
				result[i][j] = narr[i][j];
				result[i][result[i].length-1] += narr[i][j];
				}	
		}
		
		
		
		for (int i = 0; i < result.length; i++) {
			System.out.println();
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j]+" ");
				 
			}
			
		}
		
		
		
	}
}
