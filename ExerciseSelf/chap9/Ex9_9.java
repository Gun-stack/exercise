package chap9;

public class Ex9_9 {
	/*
	 * (1) delChar메서드를 작성하시오.
	 */
	public static String delChar(String src, String delch) {
		StringBuffer sb = new StringBuffer(src);

		for (int i = 0; i < sb.length(); i++) {
			for (int j = 0; j < delch.length(); j++) {
				if (sb.charAt(i) == delch.charAt(j)) {
					sb.deleteCharAt(i);
				}
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));

		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}
}
