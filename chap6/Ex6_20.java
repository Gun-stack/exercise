
public class Ex6_20 {

	 static int[] Shuffle(int[] arr) {
//		 int[] mixarr= new int[arr.length]; 
//		 System.arraycopy(arr, 0, mixarr, 0, arr.length);
		 int[] mixarr=arr.clone();
		 
		 for (int i = 0; i < 200; i++) {
			int idx1 = (int) (Math.random() * arr.length);
			int idx2 = (int) (Math.random() * arr.length);
			int tmp = mixarr[idx1];
			mixarr[idx1] = mixarr[idx2];
			mixarr[idx2] = tmp;
		}
		return mixarr;
	}

	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));
		int[] result = Shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		System.out.println(java.util.Arrays.toString(original));
		System.out.println(original==result);
	}
}
