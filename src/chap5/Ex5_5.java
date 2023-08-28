package chap5;

public class Ex5_5 {
	public static void main(String[] args) {
		//int[] arr = new int[5]{1,2,3,4,5};
		//int arr[5];
		//5-3
		System.out.println("===5-3");
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{sum +=arr[i];}
		System.out.println("sum="+sum);
	
		System.out.println("===5-5");
		
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for (int x = 0; x < 20; x++) {
			int i =(int)(Math.random()*ballArr.length);
			int j =(int)(Math.random()*ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i]=ballArr[j];
			ballArr[j]=tmp;
		}
		for (int i = 0; i< ball3.length; i++) {
			ball3[i]=ballArr[i];
		}
		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]+" ");
			
		} 
		
	}
}
