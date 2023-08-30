package chap9;

public class Ex9_3 {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		/*
		 * (1) 알맞은 코드를 넣어 완성하시오.
		 */
		path = fullPath.substring(0, fullPath.lastIndexOf("\\"));

		fileName = fullPath.substring(fullPath.lastIndexOf("\\") + 1);

		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);
	}
}
