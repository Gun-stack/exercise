package chap9;

public class Ex9_7 {
	public static  boolean contains(String src, String target) {
		if (src.indexOf(target) == -1) {
			return false;
		}
		
		else return true;
		
	 }
	
	
	/*
	 * (1) contains메서드를 작성하시오.
	 */
	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
	}
}
