import java.awt.datatransfer.StringSelection;
import java.util.Iterator;

public class StringTest1 {

	
	public static void main(String[] args) {
		String a = "a";
		a= "b";  //immutable data
		
		int n=10;
		n=20;
		
		String s1= null;
		String s2= "a"+null;
		char c = 'a';
		
		String s3 = new String("abc");
		char[] carr= {'a','b','c'};
		
		String s4 = new String(carr);
		System.out.println(s3);
		System.out.println(s4);
		
		
		StringBuffer sb = new StringBuffer("abc");
		String s5 = new String(sb);
		System.out.println(s5);
		System.out.println(s3.equals(s4));
		System.out.println(s3.equals(s5));

		String bs = "hello ";
		String cs =  bs.concat("world");
		System.out.println(bs);
		System.out.println(cs.contains(" "));

		String[] files = {"test.txt" , "temp.hwp","backup.txt"};
		for (int i = 0; i < files.length; i++) {
			if (files[i].endsWith("txt")) {
				System.out.println(files[i]);
			}
		}
		System.out.println(files[1].indexOf("p"));
		
	
	
	
	}
}
