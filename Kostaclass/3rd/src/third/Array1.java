package third;

public class Array1 {
	public static void main(String[] args) {
		int[] narr1 =new int[5];//24bite
		double[] darr1 = new double[5];//44bite
//		
//		int[] narr2;//4bite
//		narr2 = new int[10];
//		
//		narr1[0] = 1;
//		narr1[1] = 2;
//		narr1[2] = 3;
//		narr1[3] = 4;
//		narr1[4] = 5;
		int sum=0;
		
		for (int j = 0; j < narr1.length; j++) {
		sum += narr1[j]; 
			System.out.println(narr1[j]);
		}
		System.out.println(sum);
		
		
	}
}
