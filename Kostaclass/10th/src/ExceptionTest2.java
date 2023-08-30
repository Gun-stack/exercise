
public class ExceptionTest2 {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 2, 4, 6, 0, 10 };
		int tot = 0;
		int count = arr1.length;

		for (int i = 0; i < arr1.length; i++) {
			try {
				tot += arr1[i] / arr2[i];
			} catch (ArithmeticException e) {
				count--;
			} catch (ArrayIndexOutOfBoundsException e) {
				count--;
			} catch (Exception e) {//상위 exception 은 마지막에 처리
				count--;
			}
		}
		System.out.println(tot);
		System.out.println(tot / (double) count);
		System.out.println("프로그램 종료");

	}
}
