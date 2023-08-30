
public class ArrayTest_8 {
	public static void main(String[] args) {
		int[] narr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] carr = new int[4];
		
		System.arraycopy(narr1, 3, carr, 0, 4);
		for (int i = 0; i < carr.length; i++) {
			System.out.print(carr[i]+" ");
			
		}
	}
}
