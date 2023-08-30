package first;


public class StringPlus {
	public static void main(String[] args) {
		int v1=10 , v2=20 ;//같은타입
		
		int res = v1 + v2;
		System.out.println(res);
		
		String str1 = "abc";
		String str2 = "def";
		String stes = str1+str2 ;
		System.out.println(stes);
		
		System.out.println(str1+res);
		
		String seven = "7";
		char seven2 ='7'; //아스키코드 7값 = 55
		int seven3 = 7;
		
		System.out.println(seven+seven2+seven3);
		System.out.println(seven2+seven3+seven);
		System.out.println("7"+7+7);
		System.out.println(7+7+"7");
		System.out.println(7+seven2);
		
		
		
}
}
