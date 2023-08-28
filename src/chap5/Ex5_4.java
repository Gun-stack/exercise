package chap5;


public class Ex5_4 {
	public static void main(String[] args) {
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20},
				{30,30,30,30,30,30}
				};
				int total = 0;
				int count =0;
				float average = 0;
				for (int i = 0; i < arr[i].length; i++) {
					count += arr[i].length;
				}
				
				
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[0].length; j++) {
						total += arr[i][j];
					}
				}
				average = (float)total/count;

				System.out.println(count);
				System.out.println("total="+total);
				System.out.println("average="+average);
	}
}
