package chap9;

public class Ex9_4 {
	static void printGraph(int[] dataArr, char ch) {

//		for (int j = 0; j < dataArr.length; j++) {
//			for (int i = 0; i < dataArr[j]; i++) {
//				System.out.print(ch);
//			}
//			System.out.println(dataArr[j]);
//		}
	
		for(int n : dataArr) {
			for (int i=0 ; i<n; i++) {
				System.out.print(ch);
			}
			System.out.println(n);
		}
		
		
		
		
	}

	public static void main(String[] args) {
		printGraph(new int[] { 3, 7, 1, 4 }, '*');
	}
}
